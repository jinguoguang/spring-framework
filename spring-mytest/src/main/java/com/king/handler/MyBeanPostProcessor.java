package com.king.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * bean的后置处理器
 * bean的后置处理器会在生命周期的初始化前后添加额外的操作，需要实现BeanPostProcessor接口，且配置到I0C容器中，
 * 注意: bean后置处理器不是单独针对某一个bean生效，而是针对I0C容器中所有bean都会执行
 * @packageNme com.king.handler
 * @Author: jinguoguang
 * @Date: 2024/5/13 9:56
 * @Version: v1.0.0
 **/

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        //此方法在bean的生命周期初始化之前执行
        System.out.println("MyBeanPostProcessor -> 前置处理器执行postProcessBeforeInitialization,beanName="+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 此方法在bean的生命周期初始化之后执行
        System.out.println("MyBeanPostProcessor -> 后置处理器执行postProcessAfterInitialization,beanName="+beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
