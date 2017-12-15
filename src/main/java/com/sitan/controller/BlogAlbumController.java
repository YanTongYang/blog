package com.sitan.controller;

import com.sitan.entity.BlogComment;
import com.sitan.entity.BlogPic;
import com.sitan.service.BlogAlbumService;
import com.sitan.service.BlogCommentService;
import com.sitan.util.AddressUtil;
import com.sitan.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/album")
public class BlogAlbumController {



    @Autowired
    private BlogAlbumService blogAlbumService;
    @Autowired
    private BlogCommentService blogCommentService;

    @ResponseBody
    @RequestMapping(value="/getAlbums")
    public List<BlogPic> findAllAlbum(HttpServletRequest request,Model model){
        List<BlogPic> picList = blogAlbumService.findAllPic(request);
        return  picList;
    }

    @ResponseBody
    @RequestMapping(value="/getAlbumsAndComment")
    public Map<String,Object> findAllAlbumAndComments(HttpServletRequest request, Model model){
        List<BlogPic> picList = blogAlbumService.findAllPic(request);
        List<BlogComment> commentList = blogCommentService.findComments(request);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("picList", picList);
        map.put("commentList", commentList);
        return  map;
    }


}
