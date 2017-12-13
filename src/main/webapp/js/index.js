$(function(){
    getBlogType();
    getBlogMessage();
});
/*获取博客类型*/
function getBlogType(){
    $.get("/sitan_blog/type/getTypes",function(data){
        $("#blog_type").append("<h3 class=\"list-group-item active\">分类</h3>" +
            "<li class=\"list-group-item\"><a href=\"#\">全部</a></li>" +
            "<li class=\"list-group-item\"><a href=\"#\">随机</a></li>");
        $.each(data,function(index,obj){
            $("#blog_type").append("<li class=\"list-group-item\"><a href=\"#\">"+obj.typeName+"</a></li>");
        });
    });
}
/*初次加载博客文章*/
function getBlogMessage(){
    $.get("/sitan_blog/message/getMessges", function(data) {
        $.each(data,function(index,obj){
            $("#blog_message").append("<div class='blog-post'>" +
                "<h2 class='blog-post-title'><a href='#' class=' msgTitle' >"+obj.messageTitle+"</a></h2>" +
                "<p class='blog-post-meta'>"+getLocalTime(obj.messageDate)+"--点击量:"+obj.messageCount+"</p>" +
                "<pre><code>"+obj.messageDesc+"</code></pre>" +
                "</div>")
        })
    });
}