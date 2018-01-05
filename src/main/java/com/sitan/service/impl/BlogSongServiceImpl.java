package com.sitan.service.impl;

import com.sitan.dao.BlogSongAlbumDao;
import com.sitan.dao.BlogSongDao;
import com.sitan.dao.BlogSongSingerDao;
import com.sitan.dao.BlogTypeDao;
import com.sitan.dto.BlogSongDto;
import com.sitan.dto.BlogSongDtoList;
import com.sitan.entity.*;
import com.sitan.service.BlogSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogSongServiceImpl implements BlogSongService{

    @Autowired
    private BlogSongDao blogSongDao;
    @Autowired
    private BlogSongAlbumDao blogSongAlbumDao;
    @Autowired
    private BlogSongSingerDao blogSongSingerDao;
    @Autowired
    private BlogTypeDao blogTypeDao;


    public BlogSongDtoList getSongByType(Integer typeId, Integer albumId, Integer singerId) {
        BlogSongExample songExample = new BlogSongExample();
        BlogSongDtoList blogSongDtoList = new BlogSongDtoList();
        if(null != typeId){
            songExample.createCriteria().andSongTypeIdEqualTo(typeId);
            BlogTypeExample typeExample = new BlogTypeExample();
            typeExample.createCriteria().andTypeIdEqualTo(typeId);
            List<BlogType> blogTypeList = blogTypeDao.selectByExample(typeExample);
            blogSongDtoList.setTitle(blogTypeList.get(0).getTypeName());
            blogSongDtoList.setDesc(blogTypeList.get(0).getTypeName()+"类型的歌曲");
        }
        if(null != albumId){
            songExample.createCriteria().andSongAlbumIdEqualTo(albumId);
            BlogSongAlbum blogSongAlbum = blogSongAlbumDao.selectByPrimaryKey(albumId);
            blogSongDtoList.setTitle(blogSongAlbum.getAlbumName());
            blogSongDtoList.setDesc(blogSongAlbum.getAlbumDesc());

        }
        if(null != singerId){
            songExample.createCriteria().andSongSingerIdEqualTo(singerId);
            BlogSongSinger blogSongSinger = blogSongSingerDao.selectByPrimaryKey(singerId);
            blogSongDtoList.setTitle(blogSongSinger.getSingerName());
            blogSongDtoList.setDesc(blogSongSinger.getSingerDesc());
        }
        if(null == typeId && null == albumId && null == singerId){
            blogSongDtoList.setTitle("全部歌曲");
            blogSongDtoList.setDesc("以下是本小站的全部歌曲");
        }
        List<BlogSong> blogSongs = blogSongDao.selectByExample(songExample);
        List<BlogSongDto> dtoList = new ArrayList<BlogSongDto>();
        for (BlogSong blogSong : blogSongs) {
            BlogSongDto blogSongDto = new BlogSongDto();
            BlogSongAlbum blogSongAlbum = blogSongAlbumDao.selectByPrimaryKey(blogSong.getSongAlbumId());
            blogSongDto.setSongAlbum(blogSong.getSongAlbumId().toString()+"#"+blogSongAlbum.getAlbumName());
            BlogSongSinger blogSongSinger = blogSongSingerDao.selectByPrimaryKey(blogSong.getSongSingerId());
            blogSongDto.setSongSinger(blogSong.getSongSingerId().toString()+"#"+blogSongSinger.getSingerName());
            BlogTypeExample typeExample = new BlogTypeExample();
            typeExample.createCriteria().andTypeIdEqualTo(blogSong.getSongTypeId());
            List<BlogType> blogTypeList = blogTypeDao.selectByExample(typeExample);
            blogSongDto.setSongType(blogSong.getSongTypeId().toString()+"#"+blogTypeList.get(0).getTypeName());
            blogSongDto.setSongName(blogSong.getSongName());
            blogSongDto.setSongUrl(blogSong.getSongUrl());
            dtoList.add(blogSongDto);
        }
        blogSongDtoList.setBlogSongDtoList(dtoList);
        return blogSongDtoList;
    }

    public List<BlogSongAlbum> getSongAlbums() {
        BlogSongAlbumExample albumExample = new BlogSongAlbumExample();
        List<BlogSongAlbum> blogSongAlbums = blogSongAlbumDao.selectByExample(albumExample);
        return blogSongAlbums;
    }
}
