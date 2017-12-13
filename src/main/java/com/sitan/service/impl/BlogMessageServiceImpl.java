package com.sitan.service.impl;

import com.sitan.dao.BlogMessageDao;
import com.sitan.entity.BlogMessage;
import com.sitan.entity.BlogMessageExample;
import com.sitan.service.BlogMessageService;
import com.sitan.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class BlogMessageServiceImpl implements BlogMessageService{

    @Autowired
    private BlogMessageDao blogMessageDao;

    public List<BlogMessage> selectByCondition(BlogMessage message) {
        BlogMessageExample example = new BlogMessageExample();
        List<BlogMessage> messageList = blogMessageDao.selectByExample(example);
        return messageList;
    }

    public String addMessage(HttpServletRequest request){
        BlogMessage message = new BlogMessage();
        message.setMessageId(getCommentId());
        /*todo*/
        blogMessageDao.insert(message);
        return "success";
    }


    public Integer getCommentId(){
        Integer commentId = RandomUtil.getRandomId();
        BlogMessageExample example = new BlogMessageExample();
        example.createCriteria().andMessageIdEqualTo(commentId);
        List<BlogMessage> messageList = blogMessageDao.selectByExample(example);
        if(messageList!=null)
            getCommentId();
        return commentId;
    }
}
