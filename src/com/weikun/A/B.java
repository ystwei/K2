package com.weikun.A;

/**
 * Created by Administrator on 2016/11/19.
 */
public  class B extends B0{

    public B(){//
        System.out.println("1");
    }
    public B(int i) {
        super(200);
        System.out.println("7");
    }

    public static void main(String[] args) {
        new B(100);
    }
    static int age=200;
    static{

        System.out.println("5");
    }
    {
        System.out.println("2");
    }
}
class B0{
    {
        System.out.println("3");
    }
    static {
        System.out.println("6");
    }
    public B0(){

        System.out.println("4");
    }

    public B0(int i) {
        this();
        System.out.println("8");
    }
}