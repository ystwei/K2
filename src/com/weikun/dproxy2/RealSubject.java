package com.weikun.dproxy2;

/**
 * Created by Administrator on 2016/12/18.
 * CGLIB����̬�����ô��ǿ���֧��һ����Ĵ���,Ҳ������ɽӿ�
 */
public class RealSubject implements Subject{

    public void say() {
        System.out.println("��ã���������ʵ�Ļ�:say");
    }


    public void go() {
        System.out.println("��ã���������ʵ�Ļ�:go");
    }


    public void make() {
        System.out.println("��ã���������ʵ�Ļ�:make");
    }


    public void plan() {
        System.out.println("��ã���������ʵ�Ļ�:plan");
    }
}
