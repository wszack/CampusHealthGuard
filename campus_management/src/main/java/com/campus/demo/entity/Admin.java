package com.campus.demo.entity;

import lombok.Data;

/**
 * Description：管理员
 * Param：
 * return：
 * Author：zzc
 */

@Data
public class Admin {
    public Integer id;
    public String username;
    public String password;
    public String token;
    public Integer status;
}
