package com.campus.demo.controller;

import com.campus.demo.entity.Departure;
import com.campus.demo.mapper.DepartureMapper;
import com.campus.demo.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description： 离校
 * Param：
 * return：
 */

@RestController
@RequestMapping("/departure")
public class DepartureController {

    @Autowired
    private DepartureMapper departureMapper;

    @Autowired
    private DepartureService departureService;

    // 新增和修改
    @PostMapping
    public Integer save(@RequestBody Departure departure){
        // 新增或者更新
        return departureService.save(departure);
    }

    // 查询某条数据
    @GetMapping("/{id}")
    public List<Departure> findOne(@PathVariable Integer id){
        return departureMapper.findOne(id);
    }

    // 查询所有数据
    @GetMapping
    public List<Departure> findAll(){
        List<Departure> all = departureMapper.findAll();
        return all;
    }

    // 删除某条数据
    @DeleteMapping("/{id}")
    public  Integer delete(@PathVariable Integer id){
        return departureMapper.deteleById(id);
    }

    // 批量删除 假删除
    @PostMapping("/del/batch")
    public  Integer deleteBatch(@RequestBody List<Integer> ids){
        return departureMapper.deteleBatchById(ids);
    }

    @GetMapping("/page")
    public Map<String,Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String name, @RequestParam String status){
        pageNum = (pageNum-1)*pageSize;
        List<Departure> data = departureMapper.selectPage(pageNum,pageSize,name,status);
        Integer total = departureMapper.selectTotal(name,status);
        Map<String,Object> res = new HashMap<>();
        res.put("data",data);
        res.put("total",total);
        return res;
    }

    @GetMapping("/departurePage")
    public Map<String,Object> findDeparturePage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String username){
        pageNum = (pageNum-1)*pageSize;
        List<Departure> data = departureMapper.selectDeparturePage(pageNum,pageSize,username);
        Integer total = departureMapper.selectDepartureTotal(username);
        Map<String,Object> res = new HashMap<>();
        res.put("data",data);
        res.put("total",total);
        return res;
    }
}
