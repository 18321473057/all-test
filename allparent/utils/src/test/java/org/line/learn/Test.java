package org.line.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    TestBean person = context.getBean("person", TestBean.class);

}
