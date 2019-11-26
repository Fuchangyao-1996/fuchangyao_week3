package com.fuchangyao.mapper;

import com.fuchangyao.pojo.BoughtGoods;
import com.fuchangyao.pojo.BoughtGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoughtGoodsMapper {
    long countByExample(BoughtGoodsExample example);

    int deleteByExample(BoughtGoodsExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(BoughtGoods record);

    int insertSelective(BoughtGoods record);

    List<BoughtGoods> selectByExample(BoughtGoodsExample example);

    BoughtGoods selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") BoughtGoods record, @Param("example") BoughtGoodsExample example);

    int updateByExample(@Param("record") BoughtGoods record, @Param("example") BoughtGoodsExample example);

    int updateByPrimaryKeySelective(BoughtGoods record);

    int updateByPrimaryKey(BoughtGoods record);

    BoughtGoods findOne(int bid);

}