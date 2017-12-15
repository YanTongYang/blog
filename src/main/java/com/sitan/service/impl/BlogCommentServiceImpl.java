package com.sitan.service.impl;

import com.mysql.jdbc.StringUtils;
import com.sitan.dao.BlogCommentDao;
import com.sitan.entity.BlogComment;
import com.sitan.entity.BlogCommentExample;
import com.sitan.service.BlogCommentService;
import com.sitan.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class BlogCommentServiceImpl implements BlogCommentService{

    @Autowired
    private BlogCommentDao blogCommentDao;

    public List<BlogComment> findComments(HttpServletRequest request) {
        BlogCommentExample example = new BlogCommentExample();
        BlogCommentExample.Criteria criteria = example.createCriteria();
        String picId = request.getParameter("picId");
        String commentType = request.getParameter("commentType");
        if("" != commentType && commentType != null){
            criteria.andCommentTypeEqualTo(Integer.parseInt(commentType));
        }
        if("" != picId && picId != null){
            criteria.andCommentTargetEqualTo(Integer.parseInt(picId));
        }
        example.setOrderByClause("comment_Date desc");
        List<BlogComment> commentList = blogCommentDao.selectByExampleWithBLOBs(example);
        return commentList;
    }

    public String addComment(HttpServletRequest request) {
        BlogComment comment = new BlogComment();
        String user = request.getParameter("user");
        String picId = request.getParameter("picId");
        String msg = request.getParameter("msg");
        String type = request.getParameter("type");
        if(!StringUtils.isNullOrEmpty(user)){
            comment.setCommentPerson(user);
        }
        if(!StringUtils.isNullOrEmpty(picId)){
            comment.setCommentTarget(Integer.parseInt(picId));
        }
        if(!StringUtils.isNullOrEmpty(msg)){
            comment.setCommentContent(msg);
        }if(!StringUtils.isNullOrEmpty(type)){
            comment.setCommentType(Integer.parseInt(type));
        }
        comment.setCommentDate(new Date());
        comment.setCommentId(getCommentId());
        comment.setCommentParent(0);
        comment.setCommentCount(0);
        int insert = blogCommentDao.insert(comment);
        if(insert>0){
            return "留言成功";
        }else{
            return "服务器忙,请稍后重试";
        }
    }

    public Integer getCommentId(){
        Integer commentId = RandomUtil.getRandomId();
        BlogCommentExample example = new BlogCommentExample();
        example.createCriteria().andCommentIdEqualTo(commentId);
        List<BlogComment> comments = blogCommentDao.selectByExample(example);
        if(comments.size()!=0)
            getCommentId();
        return commentId;
    }
}
