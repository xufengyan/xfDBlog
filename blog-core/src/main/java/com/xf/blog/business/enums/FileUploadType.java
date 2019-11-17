package com.xf.blog.business.enums;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public enum FileUploadType {
    COMMON("xfBlog/"),
    QRCODE("xfBlog/qrcode/"),
    SIMPLE("xfBlog/article/"),
    COVER_IMAGE("xfBlog/cover/");

    private String path;

    FileUploadType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
