package com.sitan.entity;

public class BlogSongSinger {
    private Integer singerId;

    private String singerName;

    private String singerDesc;

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName == null ? null : singerName.trim();
    }

    public String getSingerDesc() {
        return singerDesc;
    }

    public void setSingerDesc(String singerDesc) {
        this.singerDesc = singerDesc == null ? null : singerDesc.trim();
    }
}