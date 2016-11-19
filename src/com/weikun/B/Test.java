package com.weikun.B;

/**
 * Created by Administrator on 2016/11/19.
 */
public class Test {
    public static void main(String[] args) {

        System.out.print(new People().count++);
        new People().count=9;
        System.out.print(new People().count++);
        System.out.print(new People().count++);

    }
}
