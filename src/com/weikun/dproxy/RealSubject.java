package com.weikun.dproxy;

/**
 * Created by Administrator on 2016/12/18.
 * java�ṩ�Ķ�̬����ȱ����ֻ֧�ֽӿڵĴ���
 */
public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("��ã���������ʵ�Ļ�:say");
    }

    @Override
    public void go() {
        System.out.println("��ã���������ʵ�Ļ�:go");
    }

    @Override
    public void make() {
        System.out.println("��ã���������ʵ�Ļ�:make");
    }

    @Override
    public void plan() {
        System.out.println("��ã���������ʵ�Ļ�:plan");
    }
}
