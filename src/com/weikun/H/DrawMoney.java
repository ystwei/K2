package com.weikun.H;

/**
 * Created by Administrator on 2016/12/11.
 */
public class DrawMoney extends Thread{
    private Account account;
    private int money;
    public DrawMoney(Account account,String name,int money){
        super(name);
        this.account=account;
        this.money=money;

    }

    @Override
    public  void run() {
        synchronized (account) {
            // 取钱
            if (account.getBalance() >= this.money) {//可以取
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                account.setBalance(account.getBalance() - this.money);
                System.out.println(this.getName() + "取了" + this.money + "钱");
            } else {
                System.out.println("余额不足,不能取钱");
            }
        }
    }
}
