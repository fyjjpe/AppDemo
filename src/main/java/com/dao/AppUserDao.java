package com.dao;

import com.model.AppUser;

import java.util.List;

/**
 * Created by yuanjie.fang on 2017/7/4.
 */
public interface AppUserDao {
    List<AppUser> findAllUser();
 }
