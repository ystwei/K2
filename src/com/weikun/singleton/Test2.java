package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test2 {
    public static void main(String[] args) {
        Animal2 a=Animal2.getInstance();

        Animal2 a1=Animal2.getInstance();

        System.out.println(a);
        System.out.println(a1);
    }
}
