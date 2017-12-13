package com.sitan.dao;

import com.sitan.entity.BlogType;
import com.sitan.entity.BlogTypeExample;
import com.sitan.entity.BlogTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTypeDao {
    int countByExample(BlogTypeExample example);

    int deleteByExample(BlogTypeExample example);

    int deleteByPrimaryKey(BlogTypeKey key);

    int insert(BlogType record);

    int insertSelective(BlogType record);

    List<BlogType> selectByExample(BlogTypeExample example);

    BlogType selectByPrimaryKey(BlogTypeKey key);

    int updateByExampleSelective(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByExample(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByPrimaryKeySelective(BlogType record);

    int updateByPrimaryKey(BlogType record);
}