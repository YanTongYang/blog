package com.sitan.service;

import com.sitan.entity.BlogComment;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BlogCommentService {

    List<BlogComment> findPicComments(HttpServletRequest request);

    String addComment(HttpServletRequest request);
}
