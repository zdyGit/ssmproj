package com.zdy;

import com.zdy.domain.College;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMprojTest {

    @Test
    public void createBeanTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        College collegeOne = applicationContext.getBean("college",College.class);
        System.out.println("college create finished!");

        SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory",SqlSessionFactory.class);

        System.out.println("sqlSessionFactory create finished!");
    }
}
