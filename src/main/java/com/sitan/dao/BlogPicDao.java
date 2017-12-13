package com.sitan.dao;

import com.sitan.entity.BlogPic;
import com.sitan.entity.BlogPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPicDao {
    int countByExample(BlogPicExample example);

    int deleteByExample(BlogPicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(BlogPic record);

    int insertSelective(BlogPic record);

    List<BlogPic> selectByExample(BlogPicExample example);

    BlogPic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") BlogPic record, @Param("example") BlogPicExample example);

    int updateByExample(@Param("record") BlogPic record, @Param("example") BlogPicExample example);

    int updateByPrimaryKeySelective(BlogPic record);

    int updateByPrimaryKey(BlogPic record);
}