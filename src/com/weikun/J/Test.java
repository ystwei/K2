package com.weikun.J;

/**
 * Created by Administrator on 2016/12/11.
 */
public class Test {
    public static void main(String[] args) {
        //创建一个账户
        Account acct = new Account("1234567" , 0);

        new SaveThread("存款者甲" , acct , 1500).start();
        new GetThread("取钱者" , acct , 800).start();

       // new SaveThread("存款者丙" , acct , 800).start();
    }
}
