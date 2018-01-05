package com.sitan.dto;

public class BlogSongDto {

    private String songId;

    private String songName;

    private String songUrl;

    private String songSinger;

    private String songAlbum;

    private String songType;

    private String title;

    private String desc;

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName == null ? null : songName.trim();
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl == null ? null : songUrl.trim();
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
