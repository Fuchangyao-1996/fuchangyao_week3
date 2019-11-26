package com.fuchangyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuchangyao.HiglightUtils.HiglightUtil;
import com.fuchangyao.pojo.Goods;
import com.fuchangyao.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by fcy on 2019/11/21.
 */
@CrossOrigin
@RequestMapping("Solr")
@Controller
public class SolrController {

    @Reference
    GoodsService goodsService;

    //solr模板
    @Autowired
    private  SolrTemplate solrTemplate;

    //mq模板
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Destination fcyQueueDestination;

    //redis模板
    @Autowired
    private RedisTemplate redisTemplate;



    //solr添加
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        Map<String, String> map = new HashMap<>();
        List<Goods> all = goodsService.findAll(map);
        for (Goods goods : all) {
            Goods g = new Goods();
            g.setId(goods.getGid());
            g.setGname(goods.getGname());
            g.setGcontent(goods.getGcontent());
            g.setGprice(goods.getGprice());
            solrTemplate.saveBean(g);
            solrTemplate.commit();
        }
        return "添加成功";
    }


    //查询所有
    @RequestMapping("/findPage")
    @ResponseBody
    public  List<Goods> findPage(@RequestParam(defaultValue = "1") Integer currentPage) {
        return HiglightUtil.findPage(solrTemplate,currentPage);
    }



    //高亮
    @RequestMapping("/High")
    @ResponseBody
    public List findPageHigh (Model model,@RequestParam String title){
        System.out.println("查询的值:"+title);
        if("".equals(title) || title==""){
           return  findPage(1);
        }
        HighlightPage<Goods> page = HiglightUtil.higlight(1, 5, solrTemplate, title);
        return  page.getContent();
    }


    /**
     * 删除所有数据
     * @return
     */
    @RequestMapping("/delAll")
    @ResponseBody
    public String delAll () {
            return HiglightUtil.delAll(solrTemplate);
        }




//    @RequestMapping("/message")
//    public @ResponseBody String message(){
//
//        //发送短信验证码
//        jmsTemplate.send(queueSolrDestination, new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                return session.createTextMessage("54628");
//            }
//        });
//
//        return "message success";
//    }

    //mq
    @RequestMapping("/message")
    @ResponseBody
    public void sendMessage(final String msg) {
        System.out.println("向队列" + fcyQueueDestination.toString() + "发送了消息------------" + msg);
        jmsTemplate.send(fcyQueueDestination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }





}
