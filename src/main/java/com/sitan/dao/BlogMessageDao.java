package com.sitan.dao;

import com.sitan.entity.BlogMessage;
import com.sitan.entity.BlogMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMessageDao {
    int countByExample(BlogMessageExample example);

    int deleteByExample(BlogMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(BlogMessage record);

    int insertSelective(BlogMessage record);

    List<BlogMessage> selectByExampleWithBLOBs(BlogMessageExample example);

    List<BlogMessage> selectByExample(BlogMessageExample example);

    BlogMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByExample(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByPrimaryKeySelective(BlogMessage record);

    int updateByPrimaryKeyWithBLOBs(BlogMessage record);

    int updateByPrimaryKey(BlogMessage record);
}