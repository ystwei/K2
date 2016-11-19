package com.weikun.B;

/**
 * Created by Administrator on 2016/11/19.
 */
public class TesCount {
    public   int count=10;//静态类属性,在实例化的时候并不会改变静态属性。
    public TesCount() {
        count++;
    }
    public  int getCount() {//静态类方法
        return count;
    }
    public static void main(String args[]) {
        TesCount ts1=new TesCount();
        System.out.println(ts1.count);//

        TesCount ts2=new TesCount();
        System.out.println(ts2.count);//



        TesCount ts3=new TesCount();
        System.out.println(ts3.count);//

    }
}
