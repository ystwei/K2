package com.weikun.K;

import org.junit.Test;

/**
 * Created by Administrator on 2016/12/11.
 */
public class A implements Runnable{
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        ThreadGroup g1=new ThreadGroup("A��");

        Thread t1=new Thread(g1,this);
        t1.setName("A");
        t1.start();


        Thread t2=new Thread(g1,this);
        t2.setName("B");
        t2.start();


        Thread t3=new Thread(g1,this);
        t3.setName("C");
        t3.start();

        Thread[] ts=new Thread[g1.activeCount()];//�������

        int count=g1.enumerate(ts);
        for(int i=0;i<count;i++){
            System.out.println(ts[i].getName()+"�������ˣ�");
        }


    }

    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
