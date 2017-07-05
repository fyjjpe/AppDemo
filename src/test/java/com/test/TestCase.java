package com.test;

import com.dao.AppUserDao;
import com.service.AppUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuanjie.fang on 2017/7/4.
 */
public class TestCase {
    ClassPathXmlApplicationContext ctx;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext(new String[]{"conf/beans.xml",
                "conf/spring-servlet.xml","conf/mybatisConfig.xml"});
    }

    @Test
    public void testAppUser(){
//        AppUserService service = ctx.getBean("appUserService",AppUserService.class);
//        service.findAllUser();
        AppUserDao dao = ctx.getBean("appUserDao",AppUserDao.class);
        System.out.println(dao.findAllUser().size());
        System.out.println(dao.findAllUser());
        System.out.println("查完了");
    }

}
