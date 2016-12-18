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
            // ȡǮ
            if (account.getBalance() >= this.money) {//����ȡ
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                account.setBalance(account.getBalance() - this.money);
                System.out.println(this.getName() + "ȡ��" + this.money + "Ǯ");
            } else {
                System.out.println("����,����ȡǮ");
            }
        }
    }
}
