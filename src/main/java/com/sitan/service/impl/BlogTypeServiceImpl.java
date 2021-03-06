package com.sitan.service.impl;

import com.sitan.dao.BlogTypeDao;
import com.sitan.entity.BlogType;
import com.sitan.entity.BlogTypeExample;
import com.sitan.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeServiceImpl implements BlogTypeService{

    @Autowired
    private BlogTypeDao blogTypeDao;

    public List<BlogType> getBLogTypes(BlogType type) {
        BlogTypeExample example = new BlogTypeExample();
        if(null != type.getTypeTypeId()){
            example.createCriteria().andTypeTypeIdEqualTo(type.getTypeTypeId());
        }
        List<BlogType> blogTypeList = blogTypeDao.selectByExample(example);
        return blogTypeList;
    }
}
