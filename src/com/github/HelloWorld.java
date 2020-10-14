package com.github;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/14 21:42
 * @Description ：
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello" + name);
    }
}
class Test {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Spring");
        helloWorld.sayHello();
    }
}
