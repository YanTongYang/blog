package com.sitan.controller;

import com.sitan.entity.BlogComment;
import com.sitan.service.BlogCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/comment")
public class BlogCommentController {

    @Autowired
    private BlogCommentService blogCommentService;

    @ResponseBody
    @RequestMapping(value="/addComment",method = RequestMethod.POST)
    public String addComment(HttpServletRequest request){
        return blogCommentService.addComment(request);
    }

    @ResponseBody
    @RequestMapping(value="/getComments",method = RequestMethod.POST)
    public List<BlogComment>  getComments(HttpServletRequest request){
        List<BlogComment> commentList = blogCommentService.findComments(request);
        return commentList;
    }


}
