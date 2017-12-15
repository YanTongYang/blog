package com.sitan.service;

import com.sitan.entity.BlogComment;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BlogCommentService {

    List<BlogComment> findComments(HttpServletRequest request);

    String addComment(HttpServletRequest request);
}
