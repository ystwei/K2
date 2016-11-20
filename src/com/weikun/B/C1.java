package com.weikun.B;

/**
 * Created by Administrator on 2016/11/20.
 */
public  class C1 extends C {
    public static void main(String[] args) {
        //new C1().go();
        new C1().bark();
    }
    @Override
    void go() {
        System.out.println("ok");
    }
}
