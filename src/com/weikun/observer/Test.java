package com.weikun.observer;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();//��������
        subject.attatch(new ConcreteObserver(subject,"MIKE"));
        subject.attatch(new ConcreteObserver(subject,"JACK"));
        subject.attatch(new ConcreteObserver(subject,"NIKE"));
        subject.setMsg("����Aliceû���ϰ�");
        subject.Notify();
        subject.setMsg("����Alice��JsonԼ����");
        subject.Notify();
    }
}
