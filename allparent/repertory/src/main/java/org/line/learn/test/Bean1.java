package org.line.learn.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean1  implements InitializingBean , BeanPostProcessor, DisposableBean {

    public Bean1() {
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }

    public  void  initMethod(){
        System.out.println("initMethod");
    }


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("beanPostprocessor.PostProcessbeforInitialization");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("beanpostProcessor.postPorcessAfterInitialization");
        return null;
    }

    @PreDestroy
    public void  preDestory(){
        System.out.println("@preDestroy");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("disposableBean.destory");
    }

    public void destroyMethod(){
        System.out.println("destroyMethod");
    }
}
