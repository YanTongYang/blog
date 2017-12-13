package com.sitan.controller;

import com.sitan.entity.BlogType;
import com.sitan.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="type")
public class BlogTypeController {

    @Autowired
    private BlogTypeService blogTypeService;

    @ResponseBody
    @RequestMapping(value="getTypes")
    public List<BlogType> getBLogTypes(){
       List<BlogType> blogTypeList = blogTypeService.getBLogTypes();
       return blogTypeList;
    }

}
