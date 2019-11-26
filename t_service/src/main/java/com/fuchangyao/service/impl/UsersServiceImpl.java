package com.fuchangyao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuchangyao.mapper.UsersMapper;
import com.fuchangyao.pojo.Users;
import com.fuchangyao.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fcy on 2019/11/19.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users findUsersById(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }
}
