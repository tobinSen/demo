package com.example.spring.demo;

public class Demo1 {

    private Long idDeve;
    private Long String ;

    public void test1(String name) {
        System.out.println(name);
    }

    public void test1(String name, Long age) {
        System.out.println(name + age+"master");
    }
    public void test2(String name, Long age) {
        System.out.println(name + age+"dev");
    }
    public void test3(String name, Long age) {
        System.out.println(name + age+"dev");
    }
    public void test4(String name, Long age) {
        System.out.println(name + age+"dev");
    }
    /**
     * 常见情况：
     *  1.merge后commit时，显示改变的会存在之前旧的显示
     *  2.merge后就没有，
     *  3.少merger多 多merge少
     *
     */
}
