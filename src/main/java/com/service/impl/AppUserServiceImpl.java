package com.service.impl;

import com.dao.AppUserDao;
import com.model.AppUser;
import com.service.AppUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2017/7/4.
 */
@Service("appUserService")
public class AppUserServiceImpl implements AppUserService {
    @Resource
    private AppUserDao appUserDao;

    @Override
    public List<AppUser> findAllUser() {
        List<AppUser> allUser = new ArrayList<>();
        try{
            allUser = appUserDao.findAllUser();
        }catch (Exception e){
            e.printStackTrace();
        }
        return allUser;
    }

}
