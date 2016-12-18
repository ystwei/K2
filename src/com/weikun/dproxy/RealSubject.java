package com.weikun.dproxy;

/**
 * Created by Administrator on 2016/12/18.
 * java提供的动态代理，缺陷是只支持接口的代理
 */
public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("你好，这是我真实的话:say");
    }

    @Override
    public void go() {
        System.out.println("你好，这是我真实的话:go");
    }

    @Override
    public void make() {
        System.out.println("你好，这是我真实的话:make");
    }

    @Override
    public void plan() {
        System.out.println("你好，这是我真实的话:plan");
    }
}
