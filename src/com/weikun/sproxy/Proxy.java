package com.weikun.sproxy;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public void say() {
        System.out.println("这是代理器说的：say");
        this.subject.say();
    }

    @Override
    public void go() {
        System.out.println("这是代理器说的：go");
        this.subject.go();
    }

    @Override
    public void make() {
        System.out.println("这是代理器说的：make");
        this.subject.make();
    }
}
