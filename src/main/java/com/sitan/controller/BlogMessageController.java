package com.sitan.controller;

import com.sitan.entity.BlogMessage;
import com.sitan.service.BlogMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="/message")
public class BlogMessageController {

    @Autowired
    private BlogMessageService blogMessageService;


    @ResponseBody
    @RequestMapping(value="/getMessges")
    public List<BlogMessage> getMessage(){
        BlogMessage message = new BlogMessage();
        List<BlogMessage> blogMessageList = blogMessageService.selectByCondition(message);
        return blogMessageList;
    }

    @ResponseBody
    @RequestMapping(value="/addMessage")
    public String addMessage(HttpServletRequest request){
        /*todo*/
        return "";
    }

}
