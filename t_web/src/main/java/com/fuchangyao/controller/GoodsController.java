package com.fuchangyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuchangyao.pojo.Goods;
import com.fuchangyao.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by fcy on 2019/11/18.
 */
@CrossOrigin
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Reference
    private GoodsService goodsService;


    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List findAll(@RequestBody Map<String,String> map){
        System.out.println("输入的价格:"+map.get("gprice"));
        System.out.println("下拉框code:"+map.get("code"));
        return goodsService.findAll(map);

    }


    @RequestMapping(value = "/delShops",method = RequestMethod.POST)
    public String findAll(String ids){
        System.out.println(ids);
        try {
            goodsService.delShops(ids);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除失败";
        }
    }


    @RequestMapping(value = "/saveGood",method = RequestMethod.POST)
    public String saveGood(@RequestBody Goods goods){
        try {

            goodsService.saveGood(goods);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
    }


    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    public Goods findAll(int id){
        return goodsService.findOne(id);

    }


    @RequestMapping(value = "/updateGood",method = RequestMethod.POST)
    public String updateGood(@RequestBody Goods goods){
        try {
            goodsService.updateGood(goods);
            return "修改成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "修改失败";
        }
    }


}
