package com.weikun.dproxy2;

/**
 * Created by Administrator on 2016/12/18.
 * CGLIB做动态代理，好处是可以支持一般类的代理,也可以完成接口
 */
public class RealSubject implements Subject{

    public void say() {
        System.out.println("你好，这是我真实的话:say");
    }


    public void go() {
        System.out.println("你好，这是我真实的话:go");
    }


    public void make() {
        System.out.println("你好，这是我真实的话:make");
    }


    public void plan() {
        System.out.println("你好，这是我真实的话:plan");
    }
}
