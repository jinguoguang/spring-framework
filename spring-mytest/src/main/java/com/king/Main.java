package com.king;

import com.king.config.RedisConfig;
import com.king.entity.User;
import com.king.service.PayService;
import com.king.service.impl.AliPayServiceImpl;
import com.king.service.impl.WechatPayServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //注解方式
        BeanFactory annotationConfigApplicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisConfig redisConfig = annotationConfigApplicationContext.getBean(RedisConfig.class);

        redisConfig.say();
        //配置文件方式
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        /**
         * 获取bean的三种方式
         * 1、根据bean的id获取
         * 2、根据bean的类型获取
         * 3、根据bean的 id和type获取
         */
        //根据id获取
        User user1 = (User) beanFactory.getBean("user");
        System.out.println("user1 = " + user1);
        // 根据类型获取
        User user2 = beanFactory.getBean(User.class);
        //根据id和类型获取
        User user = beanFactory.getBean("user", User.class);

        // Resource resource = new ClassPathResource("spring-config.xml");
        // XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        // xmlBeanFactory.getBean()

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WechatPayServiceImpl.class, AliPayServiceImpl.class);
        Map<String, PayService> beansOfType = context.getBeansOfType(PayService.class);
        for (Map.Entry<String, PayService> entry : beansOfType.entrySet()) {
            entry.getValue().pay();
        }
        System.out.println("Hello world!");
    }
}