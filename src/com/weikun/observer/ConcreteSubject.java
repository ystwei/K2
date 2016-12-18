package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/17.
 */
public class ConcreteSubject extends Subject{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
