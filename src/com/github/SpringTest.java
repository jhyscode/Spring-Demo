package com.github;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/14 21:47
 * @Description ：
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld)context.getBean("HelloWorld");

        helloWorld.sayHello();

    }
}
