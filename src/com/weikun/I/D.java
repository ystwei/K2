package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class D {
    public static void main(String[] args) {
        D0 d0=new D0();
        d0.setName("A");
        // d0.setPriority(5);//1---10
        d0.start();

        D0 d1=new D0();
        d1.setName("B");
        // d1.setPriority(6);//1---10
        d1.start();


    }
}
class D0 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<500;i++){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+":"+i);
                yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
