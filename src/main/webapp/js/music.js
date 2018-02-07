$(function(){
    getMusicType();
    getMusicAlbum();
    getMusic();
    $("#video1")[0].addEventListener("ended",function(){
        if(playStatus == 0){
            music.next();
            return;
        }else if(playStatus == 1){
            progressBar(0);
            return;
        }else if(playStatus == 2){
            music.random();
            return;
        }
    });
    /**
     * 在cookie中去musicList ,如果有的话，在播放列表中添加   playListName用来标识播放列表，好在将来进行取消播放样式
     */
    if(musicList.length == 0){
        var cookie = $.cookie("musicList");
        if(cookie){
            musicList = JSON.parse(cookie);
            if(musicList){
                $.each(musicList,function(index,obj){
                    $("#musicListUL").append("<li><a  name=\"playListName\" onmouseover=\"this.style.cursor='pointer'\"" +
                        " onclick=\"javascript:music.changeMusic('"+obj.songName+"','"+obj.songUrl+"')\">"+obj.songName+"</a></li>");
                });
            }
        }
    }
})
var interval;
var musicTime; //歌曲时间长度
var nowTime;  //现在歌曲播放的秒数
var musicList = []; // 歌曲的播放列表直接遍历是播放列表，按照index遍历是历史播放
var nowMusicIndex = 0; //现在播放的第几首
var playStatus = 0; // 0 顺序播放，1 单曲循环 2 随机播放
$("#video1")[0].autoplay = false;
$("#video1").on("canplay",function(){
    musicTime =$('#video1').get(0).duration;
});

/**
 * 跟新进度条，fullTime是整个进度条的长度
 * nowTime是歌曲现在播放的位置
 * musicTime是歌曲的时间长度
 * @param status
 */
function progressBar(status){
    var fullTime = $("#fullTime").width();
    if(status==null){
        nowTime = $("#video1")[0].currentTime;
    }else{
        nowTime = status;
    }

    if(!interval){
        interval = setInterval("progressBar()",1000);
    }

    if(nowTime/fullTime >1&&$("#video1")[0].loop==true) {
        progressBar(0);
    }else if(nowTime/fullTime >1&&$("#video1")[0].loop==false){
        window.clearInterval(interval);
        return;
    }
    /**
     * 这里的Math.floor(musicTime/60)+":"+(musicTime%60/100).toFixed(2).slice(-2)
     * 把具体的事件转化为秒
     */
    $("#musicTime").html(Math.floor(musicTime/60)+":"+(musicTime%60/100).toFixed(2).slice(-2));
    $("#currentTime").html(Math.floor(nowTime/60)+":"+(nowTime%60/100).toFixed(2).slice(-2)+"/");

    var changeTime = fullTime*(nowTime/musicTime);
    $("#nowTime").width(changeTime);
}

var music= {
    play : function(obj){
        if ($("#video1>source").length==0&&musicList.length==0) {
            layer.msg("播放列表为空");
            return;
        }
        if($("#video1>source").length==0&&musicList.length!=0){
            music.next();
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
    changeMusic : function(songName,songUrl) {
        $("#stop").click();
        progressBar(0);
        $("#video1").prepend("<source src='"+songUrl+"'>");
        $("#video1").load();
        music.addMusic(songName,songUrl);
        $("#play").click();
    },
    next : function(){
        if (musicList.length==0) {
            layer.msg("播放列表为空");
            return false;
        }
        if(playStatus == 0){
        }else if(playStatus == 1){
        }else if(playStatus == 2){
            music.random();
            return;
        }
        nowMusicIndex ++;
        if (nowMusicIndex >= musicList.length) {
            nowMusicIndex = 0;
        }
        if(nowMusicIndex < 0){
            nowMusicIndex = musicList.length-1;
        }
        music.changeMusic(musicList[nowMusicIndex].songName,musicList[nowMusicIndex].songUrl);
    },
    pre : function () {
        if (musicList.length==0) {
            layer.msg("播放列表为空");
            return false;
        }
        nowMusicIndex --;
        if (nowMusicIndex >= musicList.length) {
            nowMusicIndex = 0;
        }
        if(nowMusicIndex < 0){
            nowMusicIndex = musicList.length-1;
        }
        music.changeMusic(musicList[nowMusicIndex].songName,musicList[nowMusicIndex].songUrl);
    },
    random : function () {
        nowMusicIndex = randomNum(0,musicList.length-1);
        music.changeMusic(musicList[nowMusicIndex].songName,musicList[nowMusicIndex].songUrl);
    },
    addMusic : function(songName,songUrl) {
        if (music.checkMusicList(songName) == false) {
            $.each(musicList,function(index,obj){
                obj.index += 1;
            });
            musicList.push({"index":1,"songName":songName,"songUrl":songUrl});
            $.cookie("musicList",JSON.stringify(musicList));
            $("#musicListUL").append("<li><a name=\"playListName\" onmouseover=\"this.style.cursor='pointer'\"" +
                " onclick=\"javascript:music.changeMusic('"+songName+"','"+songUrl+"',this)\">"+songName+"</a></li>");
            nowMusicIndex = musicList.length-1;
        }
        /**
         * 这里是修改播放列表中正在播放的歌曲的样子，具体为添加一个播放的class
         */
        $("[name='playListName']").attr("class","");
        $.each(musicList,function(index,obj){
            if(obj.songName.indexOf(songName)==0&&obj.songUrl.indexOf(songUrl)==0){
                $("[name='playListName']:eq("+index+")").attr("class","glyphicon glyphicon-headphones btn-lg");
            }
        });
    },
    /**
     * 验证播放列表中有没有这首歌
     * @param songName
     * @returns {boolean}
     */
    checkMusicList : function(songName) {
        if(musicList.length == 0){
            return false;
        }
        for(var j = 0; j<musicList.length;j++){
            if(musicList[j].songName == songName){
                /**
                 * 如果存在，则将新播放的这首放于最前面
                 */
                $.each(musicList,function(index,obj){
                    if(obj.index<musicList[j].index)
                     obj.index += 1;
                })
                musicList[j].index = 1;

                return true;
            }
        }
        return false;
    }
}

/**
 * 修改音乐的播放方式  0 顺序，1 单曲， 2随机
 * @param playType
 */
function changePlayMethod(playType){
    playStatus = playType;
    if(playStatus == 0){
        $("#video1")[0].loop = false;
        $("#repeatMethod").attr("class","glyphicon glyphicon-repeat btn-lg dropdown-toggle");
    }else if(playStatus == 1){
        $("#video1")[0].loop = true;
        $("#repeatMethod").attr("class","glyphicon glyphicon-refresh btn-lg dropdown-toggle");
    }else if(playStatus == 2){
        $("#video1")[0].loop = false;
        $("#repeatMethod").attr("class","glyphicon glyphicon-random btn-lg dropdown-toggle");
    }
    $("[name='repeatTypeName']").attr("class","");
    $("[name='repeatTypeName']:eq("+playType+")").attr("class","glyphicon glyphicon-ok btn-lg");

}

/**
 * 获取固定范围内的整数
 * @param minNum
 * @param maxNum
 * @returns {*}
 */
function randomNum(minNum,maxNum){
    switch(arguments.length){
        case 1:
            return parseInt(Math.random()*minNum+1);
            break;
        case 2:
            return parseInt(Math.random()*(maxNum-minNum+1)+minNum);
            break;
        default:
            return 0;
            break;
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
            $("#songBody").append("<tr ondblclick=\"javascript:music.changeMusic('"+obj.songName+"',"+obj.songUrl+");\">\n" +
                "\t    \t\t<td >"+index+1+"</td>\n" +
                "\t    \t\t<td>"+obj.songName+"</td>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic(null,"+(obj.songSinger).split("#")[0]+",null)\">"+(obj.songSinger).split("#")[1]+"</td></a>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic(null,null,"+(obj.songAlbum).split("#")[0]+")\">"+(obj.songAlbum).split("#")[1]+"</a></td>\n" +
                "\t    \t\t<td><a href=\"javascript:getMusic("+(obj.songType).split("#")[0]+",null,null);\">"+(obj.songType).split("#")[1]+"</a></td>\n" +
                "\t    \t\t<td><a href=\"javascript:music.changeMusic('"+obj.songName+"',"+obj.songUrl+");\"><span class=\"glyphicon glyphicon-success glyphicon-play-circle\"></span></a>&nbsp;&nbsp;</td>\n" +
                "\t    \t</tr>");
        });
    });
}