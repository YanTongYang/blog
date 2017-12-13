$(function(){
    getAlbumList();
});

var cookie;
var myPicId;

function clickHiddenModal(picId){
    getAlbumById(picId);
    $("#hiddenModal").click();
}
function submitComment(){
    var msg = $("#commentContent").val();
    if(!msg){
        layer.msg("输入内容不能为空");
        return;
    }
    cookie = $.cookie("leaveMsgUser");
    if(cookie){
        $("#picCloseButton").click();
        $("#leaveMsgUser").val(cookie);
    }else{
        $("#picCloseButton").click();
    }
    $("#hiddenUser").click();
}
function addUserCookie(){
    var leaveMsgUser = $("#leaveMsgUser").val();
    if(leaveMsgUser){
        $.cookie("leaveMsgUser",$("#leaveMsgUser").val());
    }else{
        alert("可以告诉我你是谁吗?");
        return;
    }
    addAlbumComment(leaveMsgUser,$("#commentContent").val());

}
function addAlbumComment(user,msg){
    var data = {
        "user" : user,
        "msg" : msg,
        "picId" : myPicId,
        "type" : '2'
    }
    $.post("/sitan_blog/comment/addComment",data,function(data){
        $("#userCloseButton").click();
        $("#commentContent").val("");
        layer.msg(data);
    });
}

function getAlbumList() {
    $.get("/sitan_blog/album/getAlbums",function(data){
        $("#blog_album").empty();
        $.each(data,function(index,obj){
            $("#blog_album").append("<div class=\"col-sm-4 col-md-3 col-xs-12  item\">\n" +
                "            <div class=\"thumbnail\">\n" +
                "              <img src=\""+obj.picUrl+"\" alt=\"...\">\n" +
                "              <div class=\"caption\">\n" +
                "                <h3 class=\"text-center\">"+obj.picTitle+"</h3>\n" +
                "                <p class=\"text-center\"><button type=\"button\" class=\"btn btn-primary\" onclick=\"clickHiddenModal("+obj.picId+")\">查看详情</button>  <a href=\"#\" class=\"btn btn-default\" role=\"button\">Button</a></p>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>");
        });
    });
}

function getAlbumById(picId) {
    myPicId = picId;
    $.get("/sitan_blog/album/getAlbumsAndComment",{"picId":picId},function(data){
        $("#myTitle").text(data.picList[0].picTitle);
        $("#myText").text(data.picList[0].picText);
        $("#myPic").attr("src",data.picList[0].picUrl);
        console.info(data);
        $("#myComment").empty();
        $.each(data.commentList,function(index,obj){
            $("#myComment").append("<p>"+obj.commentPerson+":"+obj.commentContent+"</p><small>"+getLocalTime(obj.commentDate)+"</small><hr>");
        });
    });
}

