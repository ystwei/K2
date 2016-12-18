package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test1 {
    public static void main(String[] args) {
        Animal1 a=Animal1.getInstance();
        Animal1 a1=Animal1.getInstance();
        System.out.println(a);
        System.out.println(a1);
    }
}
