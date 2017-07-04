package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yuanjie.fang on 2017/7/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void cleanTable() {
        try {
            userDao.cleanTable();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
