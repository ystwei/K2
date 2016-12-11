package com.weikun.J;

/**
 * Created by Administrator on 2016/12/11.
 */
public class SaveThread extends Thread {

    //模拟用户账户
    private Account account;
    //当前取钱线程所希望存款的钱数
    private int money;

    public SaveThread(String name , Account account ,
                         int money){
        super(name);
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){

            account.save(this.money);
        }
    }
}
