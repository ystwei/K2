package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        Animal a= Animal.getInstance();
        Animal a1= Animal.getInstance();
        System.out.println(a);
        System.out.println(a1);//Animal@XXXX
    }
}
