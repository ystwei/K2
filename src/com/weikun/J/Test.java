package com.weikun.J;

/**
 * Created by Administrator on 2016/12/11.
 */
public class Test {
    public static void main(String[] args) {
        //����һ���˻�
        Account acct = new Account("1234567" , 0);

        new SaveThread("����߼�" , acct , 1500).start();
        new GetThread("ȡǮ��" , acct , 800).start();

       // new SaveThread("����߱�" , acct , 800).start();
    }
}
