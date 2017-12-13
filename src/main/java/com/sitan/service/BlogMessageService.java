package com.sitan.service;

import com.sitan.entity.BlogMessage;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface BlogMessageService {

    List<BlogMessage> selectByCondition(BlogMessage message);

    String addMessage(HttpServletRequest request);

}
