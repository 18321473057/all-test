package org.line.learn.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**bean声明周期*/
public class BeanLife implements InitializingBean, DisposableBean, BeanPostProcessor {

    @PostConstruct
    public void postConstruct() {
        System.out.println("@postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializingBean.afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("bean-(initmethod)");
    }

    public void inferredaa() {
        System.out.println("bean-(destoryMethod)");
    }

    @PreDestroy
    public void destoryMethod() {
        System.out.println("@preDestrpy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("disposableBean.destory");
    }
    public BeanLife() {
        System.out.println("init--------------------------------------------------------------------------------------------------");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor.postprocessAfterInitialization");
        return o;
    }
}
