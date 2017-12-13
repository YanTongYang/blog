package com.sitan.service;

import com.sitan.entity.BlogPic;
import com.sitan.util.ReturnResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BlogAlbumService {
    List<BlogPic> findAllPic(HttpServletRequest request);
}
