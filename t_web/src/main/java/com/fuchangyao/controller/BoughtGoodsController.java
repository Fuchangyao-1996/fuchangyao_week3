package com.fuchangyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuchangyao.pojo.BoughtGoods;
import com.fuchangyao.pojo.Goods;
import com.fuchangyao.service.BoughtGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.*;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.List;
import java.util.Map;

/**
 * Created by fcy on 2019/11/18.
 */
@CrossOrigin
@RestController
@RequestMapping("BoughtGoods")
public class BoughtGoodsController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Destination fcyQueueDestination;

    @Reference
    private BoughtGoodsService boughtGoodsService;

    @RequestMapping(value = "/queryBoughtGoods",method = RequestMethod.GET)
    public List queryBoughtGoods(){
        return boughtGoodsService.queryBoughtGoods();
    }


    @RequestMapping(value = "/saveBoughtGoods",method = RequestMethod.POST)
    public String saveBoughtGoods(@RequestBody final BoughtGoods boughtGoods ){
        System.out.println("向队列" + fcyQueueDestination.toString() + "发送了消息------------" + boughtGoods);
          jmsTemplate.send(fcyQueueDestination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(boughtGoods.toString());
            }
        });
        try {
            boughtGoodsService.saveBoughtGoods(boughtGoods);
            return "购买成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "购买失败";
        }
    }

   /* @RequestMapping("/message")
    @ResponseBody
    public void sendMessage(final String msg) {
        System.out.println("向队列" + fcyQueueDestination.toString() + "发送了消息------------" + msg);
        jmsTemplate.send(fcyQueueDestination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }*/





    @RequestMapping(value = "/delbyId",method = RequestMethod.GET)
    public String delbyId(int id){
        try {
            // 删除记录
            boughtGoodsService.delbyId(id);
            return "退货成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "退货失败";
        }
    }


}
