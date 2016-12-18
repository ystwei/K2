package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/17.
 */
public class ConcreteObserver extends Observer {
    private ConcreteSubject s;
    private String name;

    public ConcreteObserver(ConcreteSubject s,String name){
        this.s=s;
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println(name+"ÖªµÀ£¡"+s.getMsg());
    }
}
