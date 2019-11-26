package com.fuchangyao.service;

import com.fuchangyao.pojo.Goods;

import java.util.List;
import java.util.Map;

/**
 * Created by fcy on 2019/11/19.
 */
public interface GoodsService {


    public List<Goods> findAll(Map<String,String> map);



    public void delShops(String ids);


    public void saveGood(Goods goods);


    public Goods findOne(int id);


    public void updateGood(Goods goods);


}
