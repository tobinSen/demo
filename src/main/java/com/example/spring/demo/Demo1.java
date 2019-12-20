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
     *  3.少merger多 -->可能存在冲突，但是不会覆盖多的内容
     *
     *  多merge少    -->没有冲突(不修改老的代码的前提下)
     *
     * rebase current onto selected:将所选分支提交添加到当前分支
     * checkout-rebase：将当前分支提交添加到所选分支
     */
}
