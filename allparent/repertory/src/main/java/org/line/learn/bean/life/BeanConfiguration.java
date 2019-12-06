package org.line.learn.bean.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

//    @Bean(initMethod = "initMethod",destroyMethod = "inferredaa")
    public BeanLife beanLife(){
        return  new BeanLife();
    }

}
