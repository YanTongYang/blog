package com.sitan.service.impl;

import com.sitan.dao.BlogPicDao;
import com.sitan.entity.BlogPic;
import com.sitan.entity.BlogPicExample;
import com.sitan.service.BlogAlbumService;
import com.sitan.util.ReturnResult;
import com.sitan.util.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class BlogAlbumServiceImpl implements BlogAlbumService{

    @Autowired
    private BlogPicDao blogPicDao;

    public List<BlogPic> findAllPic(HttpServletRequest request){
        BlogPicExample example = new BlogPicExample();
        String picId = request.getParameter("picId");
        if("" != picId && picId != null){
            example.createCriteria().andPicIdEqualTo(Integer.parseInt(picId));
        }
        List<BlogPic> picList = blogPicDao.selectByExample(example);
        return picList;
    }
}
