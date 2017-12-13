package com.sitan.dao;

import com.sitan.entity.BlogSong;
import com.sitan.entity.BlogSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogSongDao {
    int countByExample(BlogSongExample example);

    int deleteByExample(BlogSongExample example);

    int deleteByPrimaryKey(Integer songId);

    int insert(BlogSong record);

    int insertSelective(BlogSong record);

    List<BlogSong> selectByExample(BlogSongExample example);

    BlogSong selectByPrimaryKey(Integer songId);

    int updateByExampleSelective(@Param("record") BlogSong record, @Param("example") BlogSongExample example);

    int updateByExample(@Param("record") BlogSong record, @Param("example") BlogSongExample example);

    int updateByPrimaryKeySelective(BlogSong record);

    int updateByPrimaryKey(BlogSong record);
}