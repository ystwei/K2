package com.weikun.H;

/**
 * Created by Administrator on 2016/12/11.
 */
public class Test {
    public static void main(String[] args) {
        Account a=new Account("001",800);
        DrawMoney d=new DrawMoney(a,"¼×",800);
        d.start();

        DrawMoney d1=new DrawMoney(a,"ÒÒ",800);
        d1.start();
    }
}
