package com.fuchangyao.service;

import com.fuchangyao.pojo.BoughtGoods;

import java.util.List;

/**
 * Created by fcy on 2019/11/19.
 */
public interface BoughtGoodsService {

    public List<BoughtGoods> queryBoughtGoods();

    public void saveBoughtGoods(BoughtGoods boughtGoods);

    public void delbyId(int id);



}
