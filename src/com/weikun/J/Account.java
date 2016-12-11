package com.weikun.J;

/**
 * Created by Administrator on 2016/12/11.
 */
public class Account {
    private String accountNo;
    private double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){}

    public Account(String accountNo , double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    private boolean flag=false;//false:没钱了，可以存钱了 true:有钱了，可以取了

    /**
     *
     * @param：money取了多钱
     */
    public void draw(int money){
        synchronized (this) {
            if (flag == false) {//没钱了，只能存钱

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("取了" + money);
                this.balance -= money;
                flag = false;
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notifyAll();
            }
        }

    }

    /**
     *
     * @param money 存了多少钱
     */
    public void save(int money){
        synchronized (this) {
            if (flag == true) {//不能存
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {//可以存了

                System.out.println("存了" + money);
                this.balance += money;
                flag = true;
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                notifyAll();
            }
        }

    }

}
