package com.sitan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;


@Controller
@RequestMapping(value = "/userImage")
public class FileUpload {

    @ResponseBody
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadImg(MultipartFile file, HttpServletRequest request){
        UUID uuid = UUID.randomUUID();
        String filename = uuid.toString();
        filename += file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String filePath = "";
        if (!file.isEmpty()) {
            try {
                File myfile = new File("../webapps/sitan_blog/userImg/");
                if(!myfile.exists()){
                    myfile.mkdir();
                }
                // 文件保存路径
                filePath = "../webapps/sitan_blog/userImg/"+filename;
                // 转存文件
                String url = System.getProperty("user.dir");
                file.transferTo(new File(filePath));
            } catch (Exception e) {
                e.printStackTrace();

                return "服务器出错,请稍后重试";
            }
        }
        return filename;
    }
}
