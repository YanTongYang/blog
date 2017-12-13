package com.sitan.util;

/**
 * 使用枚举表示常用数据
 */
public class StatusType {

    public static final Integer COMMENT_TYPE_LEAVE = 0 ;
    public static final Integer COMMENT_TYPE_MESSAGE = 1;
    public static final Integer COMMENT_TYPE_ALBUM = 2;

    public static final String EXECUTE_SUCCESS_INFO = "执行成功";
    public static final String EXECUTE_ERROR_INFO = "服务器内部出错,请稍后重试";
    public static final String EXECUTE_SUCCESS_NUM = "200";
    public static final String EXECUTE_ERROR_NUM = "500";

    public static Integer getCommentTypeLeave() {
        return COMMENT_TYPE_LEAVE;
    }

    public static Integer getCommentTypeMessage() {
        return COMMENT_TYPE_MESSAGE;
    }

    public static Integer getCommentTypeAlbum() {
        return COMMENT_TYPE_ALBUM;
    }

    public static String getExecuteSuccessInfo() {
        return EXECUTE_SUCCESS_INFO;
    }

    public static String getExecuteErrorInfo() {
        return EXECUTE_ERROR_INFO;
    }

    public static String getExecuteSuccessNum() {
        return EXECUTE_SUCCESS_NUM;
    }

    public static String getExecuteErrorNum() {
        return EXECUTE_ERROR_NUM;
    }
}

