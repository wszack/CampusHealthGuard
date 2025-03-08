package com.campus.demo.entity;

import lombok.Data;

/**
 * Description：教师
 * Param：
 * return：
 * Author：zzc
 */

@Data
public class Teacher {
    public Integer id;
    public String username;
    public String password;
    public String token;
    public String name;
    public String tel;
    public String email;
    public String address;
    public Integer status;
}
