package com.weikun.dproxy2;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Test {
    public static void main(String[] args) {
        MyInterector i=new MyInterector();
        Object o=i.getObject(RealSubject.class);

        Subject r=(Subject)o;

        r.go();
    }
}
