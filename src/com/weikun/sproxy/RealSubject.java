package com.weikun.sproxy;

/**
 * Created by Administrator on 2016/12/18.
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
}
