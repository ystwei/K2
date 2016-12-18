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
        System.out.println("���Ǵ�����˵�ģ�say");
        this.subject.say();
    }

    @Override
    public void go() {
        System.out.println("���Ǵ�����˵�ģ�go");
        this.subject.go();
    }

    @Override
    public void make() {
        System.out.println("���Ǵ�����˵�ģ�make");
        this.subject.make();
    }
}
