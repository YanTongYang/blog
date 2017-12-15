$(document).ready(function() {
    $('#summernote').summernote({
        placeholder: '欢迎大家留言',
        minHeight : 200,
        callbacks : {
            onImageUpload : function(files){
                var $files = $(files);
                $files.each(function(){
                    var file  = this;
                    var formData = new FormData();
                    formData.append("file",file);
                    layer.load(0, {shade: false});
                    $.ajax({
                        data: formData,
                        type: "POST",
                         url: "/sitan_blog/userImage/upload",
                        cache: false,
                        contentType: false,
                        processData: false,
                        success: function(data) {
                            layer.closeAll('loading');
                            var filepath = "/sitan_blog/userImg/"+data;
                            $('#summernote').summernote('insertImage', filepath, function($image) {
                                // todo，后续可以对image对象增加新的css式样等等，这里默认
                            });
                        }
                    });

                });
            }
        }
    });
    getCommentList();
});
function submitMsg(){
    var cookie = $.cookie("leaveMsgUser");
    if(cookie){
        $("#leaveMsgUser").val(cookie);
    }
    $("#hiddenUser").click();
}

function addUserCookie(){
    var leaveMsgUser = $("#leaveMsgUser").val();
    if(leaveMsgUser){
        $.cookie("leaveMsgUser",$("#leaveMsgUser").val());
    }else{
        layer.msg("可以告诉我你是谁吗?");
        return;
    }
    var s = $('#summernote').summernote('code');
    console.info(s);
    if(s=="\n" +
        "\t<p><br></p>\n" +
        "\t"||s==""){
        layer.msg("留言内容不能为空");
        return;
    }
    addComment($.cookie("leaveMsgUser"),s)
}
function addComment(user,msg){
    var data = {
        "user" : user,
        "msg" : msg,
        "type" : '0'
    }
    layer.load(0, {shade: false});
    $.post("/sitan_blog/comment/addComment",data,function(data){
        layer.closeAll('loading');
        $("#userCloseButton").click();
        layer.msg(data);
        getCommentList();
        $('#summernote').summernote('code',"");
    });
}
function getCommentList() {
    $.post("/sitan_blog/comment/getComments",{"commentType":'0'},function(data){
        $("#blog_Comments").empty();
        $.each(data,function(index,obj){
            $("#blog_Comments").append("<pre class=\"center-block\"><code><p>"+obj.commentPerson+":"+obj.commentContent+"</p><small>"+getLocalTime(obj.commentDate)+"</small></code></pre><hr>")
        });
    });
}