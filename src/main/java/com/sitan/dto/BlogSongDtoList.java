package com.sitan.dto;

import java.util.List;

public class BlogSongDtoList {

    private String title;

    private String desc;

    private List<BlogSongDto> blogSongDtoList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<BlogSongDto> getBlogSongDtoList() {
        return blogSongDtoList;
    }

    public void setBlogSongDtoList(List<BlogSongDto> blogSongDtoList) {
        this.blogSongDtoList = blogSongDtoList;
    }
}
