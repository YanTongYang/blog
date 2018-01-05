package com.sitan.controller;

import com.sitan.dto.BlogSongDtoList;
import com.sitan.entity.BlogSongAlbum;
import com.sitan.service.BlogSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "/song")
public class BlogSongController {

    @Autowired
    private BlogSongService blogSongService;

    @ResponseBody
    @RequestMapping(value="/getSongs")
    public BlogSongDtoList getSongsByTypeId(Integer typeId, Integer albumId, Integer singerId){
        return blogSongService.getSongByType(typeId,albumId,singerId);
    }

    @ResponseBody
    @RequestMapping(value="/getSongAlbums")
    public List<BlogSongAlbum> getSongAlbums(){
        return blogSongService.getSongAlbums();
    }
}
