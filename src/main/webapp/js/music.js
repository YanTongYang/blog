$(function(){
    getMusicType();
    getMusicAlbum();
    getMusic();
})
var interval;
var musicTime; //歌曲时间长度
var nowTime;  //现在绿条的长度
$("#video1")[0].autoplay = false;
$("#video1").on("canplay",function(){
    musicTime =$('#video1').get(0).duration;
});

function progressBar(status){
    if(!interval){
        interval = setInterval("progressBar()",1000);
    }
    var fullTime = $("#fullTime").width();
    var perTime = fullTime/musicTime;
    if(status==null){
        nowTime = $("#nowTime").width();
    }else{
        nowTime = status;
    }
    if(nowTime/fullTime >1){
        window.clearInterval(interval);
        return;
    }
    var changeTime = nowTime+ perTime;
    $("#nowTime").width(changeTime);
}

var music= {
    play : function(obj){
        if ($("#video1>source").length==0) {
            layer.msg("播放列表为空");
            return;
        }
        if($(obj).attr("class").split("play")){
            $(obj).attr("class","glyphicon glyphicon-pause btn-lg");
            $(obj).attr("onclick","music.stop(this)");
            $(obj).attr("id","stop");
        }
        $("#video1")[0].play();
        if(!interval){
            progressBar();
        }
    },
    stop : function(obj) {
        if($(obj).attr("class").split("pause")){
            $(obj).attr("class","glyphicon glyphicon-play btn-lg");
            $(obj).attr("onclick","music.play(this)");
            $(obj).attr("id","play");
        }
        $("#video1")[0].pause();
        window.clearInterval(interval);
        interval = null;
    },
    changeMusic : function(songUrl) {
        $("#stop").click();
        progressBar(0);
        $("#video1").prepend("<source src='"+songUrl+"'>");
        $("#video1").load();
        $("#play").click();
    },
    next : function(obj){

    },
    pre : function (obj) {

    }
}
/*获取音乐类型*/
function getMusicType(){
    $.get("/sitan_blog/type/getTypes",{"typeTypeId":1},function(data){
        $("#music_type").append("<h3 class=\"list-group-item active\" style=\"margin-top: 0px;\">歌曲类型</h3>" +
            "<li class=\"list-group-item\"><a href=\"javascript:getMusic()\">全部</a></li>"
            /* +"<li class=\"list-group-item\"><a href=\"javascript:getBlogMessage()\">随机</a></li>"*/);
        $.each(data,function(index,obj){
            $("#music_type").append("<li class=\"list-group-item\"><a href=\"javascript:getMusic("+obj.typeId+",null,null)\">"+obj.typeName+"</a></li>");
        });
    });
}
/*获取专辑列表*/
function getMusicAlbum(){
    $.get("/sitan_blog/song/getSongAlbums",function(data){
        $("#music_album").append("<h3 class=\"list-group-item active\" style=\"margin-top: 0px;\">专辑列表</h3>" +
            "<li class=\"list-group-item\"><a href=\"javascript:getMusic()\">全部</a></li>"
            /* +"<li class=\"list-group-item\"><a href=\"javascript:getBlogMessage()\">随机</a></li>"*/);
        $.each(data,function(index,obj){
            $("#music_album").append("<li class=\"list-group-item\"><a href=\"javascript:getMusic(null,null,"+obj.albumId+")\">"+obj.albumName+"</a></li>");
        });
    });
}

function getMusic(typeId,singerId,albumId){
    $("#title").html();
    $("#desc").empty();
    $("#songBody").empty();
    $.get("/sitan_blog/song/getSongs",{"typeId":typeId,"singerId":singerId,"albumId":albumId},function(data){
        $("#title").html(data.title);
        $("#desc").append("<p>"+data.desc+"</p>");
        $.each(data.blogSongDtoList,function(index,obj){
            $("#songBody").append("<tr ondblclick=\"javascript:music.changeMusic("+obj.songUrl+");\">\n" +
                "\t    \t\t<td >"+index+1+"</td>\n" +
                "\t    \t\t<td>"+obj.songName+"</td>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic(null,"+(obj.songSinger).split("#")[0]+",null)\">"+(obj.songSinger).split("#")[1]+"</td></a>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic(null,null,"+(obj.songAlbum).split("#")[0]+")\">"+(obj.songAlbum).split("#")[1]+"</a></td>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic("+(obj.songType).split("#")[0]+",null,null);\">"+(obj.songType).split("#")[1]+"</a></td>\n" +
                "\t    \t\t<td><a href=\"javascript:music.changeMusic("+obj.songUrl+");\"><span class=\"glyphicon glyphicon-success glyphicon-headphones\"></span></a>&nbsp;&nbsp;\n" +
                "\t    \t\t<a href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a></td>\n" +
                "\t    \t</tr>");
        });
    });
}