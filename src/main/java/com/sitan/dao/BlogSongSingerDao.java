package com.sitan.dao;

import com.sitan.entity.BlogSongSinger;
import com.sitan.entity.BlogSongSingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogSongSingerDao {
    int countByExample(BlogSongSingerExample example);

    int deleteByExample(BlogSongSingerExample example);

    int deleteByPrimaryKey(Integer singerId);

    int insert(BlogSongSinger record);

    int insertSelective(BlogSongSinger record);

    List<BlogSongSinger> selectByExample(BlogSongSingerExample example);

    BlogSongSinger selectByPrimaryKey(Integer singerId);

    int updateByExampleSelective(@Param("record") BlogSongSinger record, @Param("example") BlogSongSingerExample example);

    int updateByExample(@Param("record") BlogSongSinger record, @Param("example") BlogSongSingerExample example);

    int updateByPrimaryKeySelective(BlogSongSinger record);

    int updateByPrimaryKey(BlogSongSinger record);
}