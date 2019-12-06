package org.line.learn.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public Bean1 bean1(){
        return new Bean1();
    }
}
