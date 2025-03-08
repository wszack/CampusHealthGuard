package com.campus.demo.entity;

import lombok.Data;

/**
 * Description：文章管理
 * Param：
 * return：
 * Author：zzc
 */

@Data
public class Articles {
    public Integer id;
    public String title;
    public String pub_time;
    public String pub_author;
    public String pub_content;
    public String pub_type;
}