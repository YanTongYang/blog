package com.sitan.dao;

import com.sitan.entity.BlogSongAlbum;
import com.sitan.entity.BlogSongAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogSongAlbumDao {
    int countByExample(BlogSongAlbumExample example);

    int deleteByExample(BlogSongAlbumExample example);

    int deleteByPrimaryKey(Integer albumId);

    int insert(BlogSongAlbum record);

    int insertSelective(BlogSongAlbum record);

    List<BlogSongAlbum> selectByExample(BlogSongAlbumExample example);

    BlogSongAlbum selectByPrimaryKey(Integer albumId);

    int updateByExampleSelective(@Param("record") BlogSongAlbum record, @Param("example") BlogSongAlbumExample example);

    int updateByExample(@Param("record") BlogSongAlbum record, @Param("example") BlogSongAlbumExample example);

    int updateByPrimaryKeySelective(BlogSongAlbum record);

    int updateByPrimaryKey(BlogSongAlbum record);
}