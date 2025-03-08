package com.campus.demo.entity;

import lombok.Data;

/**
 * Description：健康信息
 * Param：
 * return：
 * Author：zzc
 */
@Data
public class Health {
    public Integer id;
    public String username;
    public String name;
    public Float temperature;
    public String address;
    public String health;
    public String contact_infection;
    public String remarks;
    public String u_type;
    public String last_time;
}