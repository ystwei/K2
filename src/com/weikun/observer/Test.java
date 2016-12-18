package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();//具体主题
        subject.attatch(new ConcreteObserver(subject,"MIKE"));
        subject.attatch(new ConcreteObserver(subject,"JACK"));
        subject.attatch(new ConcreteObserver(subject,"NIKE"));
        subject.setMsg("今天Alice没来上班");
        subject.Notify();
        subject.setMsg("今天Alice和Json约会那");
        subject.Notify();
    }
}
