package com.fuchangyao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuchangyao.mapper.GoodsMapper;
import com.fuchangyao.pojo.Goods;
import com.fuchangyao.pojo.GoodsExample;
import com.fuchangyao.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by fcy on 2019/11/19.
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll(Map<String,String> map) {
        String gname = map.get("gname");    // 商品名称
        String code = map.get("code");      // 1:大于 2:小于
        String gprice = map.get("gprice");  // 条件价格

        GoodsExample example = new GoodsExample();  //创建条件

        //商品名称模糊查询
        if(gname!=null && !"".equals(gname)){
            example.createCriteria().andGnameLike("%"+gname+"%");
        }

        if(code!=null && !"".equals(code) && gprice!=null && !"".equals(gprice)){
            if(code.equals("1")){
                //价格大于查询
                if(gprice!=null && !"".equals(gprice)){
                    example.createCriteria().andGpriceGreaterThan(Double.valueOf(gprice));
                }
            }
            if(code.equals("2")){
                //价格小于查询
                if(gprice!=null && !"".equals(gprice)){
                    example.createCriteria().andGpriceLessThan(Double.valueOf(gprice));
                }
            }
        }
         return goodsMapper.selectByExample(example);
    }

    @Override
    public void delShops(String ids) {
        String[] split = ids.split(",");
        for (String s : split) {
            goodsMapper.deleteByPrimaryKey(Integer.parseInt(s));
        }
    }

    @Override
    public void saveGood(Goods goods) {
        goodsMapper.insertSelective(goods);
    }

    @Override
    public Goods findOne(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateGood(Goods goods) {
        goodsMapper.updateByPrimaryKey(goods);
    }


}
