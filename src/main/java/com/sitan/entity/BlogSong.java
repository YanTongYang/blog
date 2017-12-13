package com.sitan.entity;

public class BlogSong {
    private Integer songId;

    private String songName;

    private String songUrl;

    private Integer songSingerId;

    private Integer songAlbumId;

    private Integer songTypeId;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
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

    public Integer getSongSingerId() {
        return songSingerId;
    }

    public void setSongSingerId(Integer songSingerId) {
        this.songSingerId = songSingerId;
    }

    public Integer getSongAlbumId() {
        return songAlbumId;
    }

    public void setSongAlbumId(Integer songAlbumId) {
        this.songAlbumId = songAlbumId;
    }

    public Integer getSongTypeId() {
        return songTypeId;
    }

    public void setSongTypeId(Integer songTypeId) {
        this.songTypeId = songTypeId;
    }
}