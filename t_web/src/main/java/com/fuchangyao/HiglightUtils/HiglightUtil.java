package com.fuchangyao.HiglightUtils;

import com.fuchangyao.pojo.Goods;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solr工具类
 * Created by Administrator on 2019/11/14.
 */
public class HiglightUtil {


    /**
     * 分页查询
     * @param solrTemplate
     * @param currentPage 当前页
     * @return  List集合
     */
    public static List<Goods> findPage(SolrTemplate solrTemplate,Integer currentPage) {
        int pageSize = 10;
        Query query = new SimpleQuery("*:*");
        query.setOffset((currentPage - 1) * pageSize);//开始索引（默认0）
        query.setRows(pageSize);//每页记录数(默认10)
        //从数据库获取
        ScoredPage<Goods> page = solrTemplate.queryForPage(query, Goods.class);
        List<Goods> list = page.getContent();
        return list;
    }


    /**
     * 根据关键字 高亮查询
     * @param currentPage   当前页
     * @param pageSize      每页大小
     * @param solrTemplate  solrTemplate
     * @param title         查询的关键字
     * @return page.getContent()
     */
    public static HighlightPage<Goods> higlight(int currentPage, int pageSize, SolrTemplate solrTemplate, String title){
        HighlightQuery query=new SimpleHighlightQuery();
        HighlightOptions highlightOptions=new HighlightOptions().addField("good_gname");//设置高亮的域
        highlightOptions.setSimplePrefix("<span style='color:red'>");//高亮前缀
        highlightOptions.setSimplePostfix("</span>");//高亮后缀
        query.setHighlightOptions(highlightOptions);//设置高亮选项
        //按照关键字查询
        Criteria criteria=new Criteria("good_gname").is(title);
        query.addCriteria(criteria);
        query.setOffset((currentPage-1)*pageSize);//开始索引（默认0）
        query.setRows(pageSize);//每页记录数(默认10)

        HighlightPage<Goods> page = solrTemplate.queryForHighlightPage(query, Goods.class);
        for(HighlightEntry<Goods> h: page.getHighlighted()){//循环高亮入口集合
            Goods item = h.getEntity();//获取原实体类
            if(h.getHighlights().size()>0 && h.getHighlights().get(0).getSnipplets().size()>0){
                item.setGname(h.getHighlights().get(0).getSnipplets().get(0));//设置高亮的结果
            }
        }
        return page;
    }


    //删除所有
    public static String delAll(SolrTemplate solrTemplate){
        SimpleQuery query = new SimpleQuery("*:*");
        solrTemplate.delete(query);
        solrTemplate.commit();
        return "delAll";
    }






    //solr添加
    public static String save(SolrTemplate solrTemplate){
        Map<String, String> map = new HashMap<>();
       /* List<Goods> all = goodsService.findAll(map);
        for (Goods goods : all) {
            Goods g = new Goods();
            g.setId(goods.getGid());
            g.setGname(goods.getGname());
            g.setGcontent(goods.getGcontent());
            g.setGprice(goods.getGprice());
            solrTemplate.saveBean(g);
            solrTemplate.commit();
        }*/
        return "添加成功";
    }



}
