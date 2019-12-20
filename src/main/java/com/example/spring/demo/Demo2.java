package com.example.spring.demo;

import java.util.Date;
import java.util.Random;

public class Demo2 {

    private Long id;
    private Date date;

    private String name;

    public void test2(String name) {
        System.out.println(name);
    }

    public void test1(){
        int i = new Random().nextInt();
        System.out.println(i);
    }
    public void test2(){
        int i = new Random().nextInt();
        System.out.println(i);
    }
    public void test3(){
        int i = new Random().nextInt();
        System.out.println(i);
    }
}
