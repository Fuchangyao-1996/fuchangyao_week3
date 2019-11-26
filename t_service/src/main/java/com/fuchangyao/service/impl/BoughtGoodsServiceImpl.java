package com.fuchangyao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuchangyao.mapper.BoughtGoodsMapper;
import com.fuchangyao.mapper.UsersMapper;
import com.fuchangyao.pojo.BoughtGoods;
import com.fuchangyao.pojo.Users;
import com.fuchangyao.service.BoughtGoodsService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by fcy on 2019/11/19.
 */
@Service
public class BoughtGoodsServiceImpl implements BoughtGoodsService {

    @Autowired
    BoughtGoodsMapper boughtGoodsMapper;

    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<BoughtGoods> queryBoughtGoods() {
        return boughtGoodsMapper.selectByExample(null);
    }

    @Override
    public void saveBoughtGoods(BoughtGoods boughtGoods) {
        //获取商品价格
        Double gprice = boughtGoods.getGprice();
        //获取商品兑换积分
        Integer gjifen = boughtGoods.getGjifen();

        //获取用户信息
        String uname = boughtGoods.getUname();
        System.out.println("用户姓名:"+uname);
        Users users = usersMapper.findByUname(uname);
        System.out.println(users);

        if(boughtGoods.getBgoumai().equals("现金购买")){
            //更新余额
            usersMapper.updyue(gprice,uname);
            //更新积分
            usersMapper.updjifen((int)(gprice*1.5),uname);
        }

        if(boughtGoods.getBgoumai().equals("积分购买")){
            usersMapper.updjifen2(gjifen,uname);
        }

        boughtGoodsMapper.insertSelective(boughtGoods);
    }

    @Override
    public void delbyId(int id) {
        // 查询退货对象
        BoughtGoods byid = boughtGoodsMapper.findOne(id);
        System.out.println("退货对象:"+byid);
        //1:王五  2:赵六
        String uid = byid.getUname();
        System.out.println("用户id为:"+uid);
        //购买方式: 现金购买 ,积分购买
        String bgoumai = byid.getBgoumai();
        System.out.println("购买方式为:"+bgoumai);
        if(bgoumai.equals("现金购买")){
            //余额 加 商品价格
            Double gprice = byid.getGprice();//商品价格
            usersMapper.updyue1(gprice,uid);
        }
        if(bgoumai.equals("积分购买")){
            // 积分数量 加 兑换积
            Integer gjifen = byid.getGjifen();//兑换积分
            usersMapper.updyue2(gjifen,uid);
        }
        boughtGoodsMapper.deleteByPrimaryKey(id);
    }


}
