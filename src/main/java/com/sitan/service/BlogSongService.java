package com.sitan.service;

import com.sitan.dto.BlogSongDtoList;
import com.sitan.entity.BlogSongAlbum;

import java.util.List;


public interface BlogSongService {

    BlogSongDtoList getSongByType(Integer typeId, Integer albumId, Integer singerId);

    List<BlogSongAlbum> getSongAlbums();
}
