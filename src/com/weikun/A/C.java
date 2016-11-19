package com.weikun.A;

/**
 * Created by Administrator on 2016/11/19.
 */
public class C extends C0 {
    public static final int OLD=100;//最终变量，不能被修改,常量
    public final  C c=new C();//public int i=100;

    int age=100;




    public static void main(String[] args) {
        new C().c.age=200;
    }
}
class C0{
    final void go(){

    }
}
