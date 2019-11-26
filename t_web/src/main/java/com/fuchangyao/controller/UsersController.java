package com.fuchangyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuchangyao.pojo.Users;
import com.fuchangyao.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fcy on 2019/11/18.
 */
@CrossOrigin
@RestController
@RequestMapping("users")
public class UsersController {

    @Reference
    private UsersService usersService;

    @RequestMapping(value = "/findUsersById",method = RequestMethod.GET)
    public Users findUsersById(int id){
        return usersService.findUsersById(id);

    }

}
