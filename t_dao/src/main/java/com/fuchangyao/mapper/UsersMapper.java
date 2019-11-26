package com.fuchangyao.mapper;

import com.fuchangyao.pojo.Users;
import com.fuchangyao.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);


    //根据姓名查询
    Users findByUname(@Param("uname")String uname);

    //根据用户id修改余额
    void updyue(@Param("uyue")Double uyue, @Param("uname")String uname);

    //根据用户姓名修改积分
    void updjifen(@Param("ujifen")int ujifen,@Param("uname")String uname);

    //根据用户姓名修改积分
    void updjifen2(@Param("ujifen")int ujifen,@Param("uname")String uname);

    //退货逻辑
    //退现金 余额 加 商品价格
    void updyue1(@Param("uyue")Double uyue, @Param("uname")String uname);

    //退积分 积分数量 加 兑换积分
    void updyue2(@Param("ujifen")int ujifen, @Param("uname")String uname);

}