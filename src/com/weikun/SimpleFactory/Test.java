package com.weikun.SimpleFactory;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        Creator c=new Creator();
        c.go(1).sale();

        c.go(2).sale();
    }
}
