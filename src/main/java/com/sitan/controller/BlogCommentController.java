package com.sitan.controller;

import com.sitan.service.BlogCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/comment")
public class BlogCommentController {

    @Autowired
    private BlogCommentService blogCommentService;

    @ResponseBody
    @RequestMapping(value="/addComment",method = RequestMethod.POST)
    public String addComment(HttpServletRequest request){
        String s = blogCommentService.addComment(request);
        return s;
    }
}
