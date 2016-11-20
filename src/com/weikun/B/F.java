package com.weikun.B;

/**
 * Created by Administrator on 2016/11/20.
 */
public class F extends   F0{
    public static void main(String[] args) {
        F0 f=new F();//向上转型--编译型和运行型不同的这种实例化被称为多态
        ((F)f).plan();
    }
    @Override
    public void go() {
        System.out.println("2");
    }
    void plan(){
        System.out.println("3");
    }
}
class F0{
    void go(){
        System.out.println("1");
    }
}
