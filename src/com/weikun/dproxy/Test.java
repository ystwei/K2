package com.weikun.dproxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new RealSubject();//被代理的
        MyProxy my=new MyProxy(subject);//代理器
        Object o=Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),subject.getClass().getInterfaces() ,
                my );

        Subject s=(Subject)o;
        s.say();
        s.go();
        s.plan();

    }
}
