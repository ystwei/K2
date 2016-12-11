package com.weikun.H;

/**
 * Created by Administrator on 2016/12/11.
 */
public class Account {
    private String no;
    private int balance;

    public Account(String no, int balance) {
        this.no = no;
        this.balance = balance;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
