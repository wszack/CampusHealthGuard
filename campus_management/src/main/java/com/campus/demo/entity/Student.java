package com.campus.demo.entity;

import lombok.Data;

/**
 * Description：学生
 * Param：
 * return：
 * Author：zzc
 */

@Data
public class Student {
    public Integer id;
    public String username;
    public String password;
    public String token;
    public String name;
    public String stuClass;
    public String dormitory;
    public String tel;
    public String email;
    public String address;
    public Integer status;
}
