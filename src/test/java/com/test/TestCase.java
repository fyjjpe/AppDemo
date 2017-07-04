package com.test;

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
        ctx = new ClassPathXmlApplicationContext("conf/beans.xml","conf/spring-servlet.xml");
    }

    @Test
    public void testAppUser(){
        AppUserService service = ctx.getBean("appUserService",AppUserService.class);
        service.findAllUser();
    }

}
