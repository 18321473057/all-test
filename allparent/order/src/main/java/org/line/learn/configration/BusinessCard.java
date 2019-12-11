package org.line.learn.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

//个人名片 ，测试配置中心
//@ConfigurationProperties(prefix = "spring.redis2")
@Component
public class BusinessCard {
//    @Value("${card.name}")
    private String name;
//    @Value("${card.age}")
    private String age;
//    @Value("${card.remark}")
    private String remark;


    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
