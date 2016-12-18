package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Animal2 {
    private Animal2(){

    }
    private volatile static Animal2 a;//jvm层对栈进行锁定
    public static Animal2 getInstance(){
        if(a==null){

            synchronized (Animal2.class){

                a=new Animal2();
            }
        }
        return a;
    }
}
