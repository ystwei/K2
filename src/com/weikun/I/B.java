package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class B {
    public static void main(String[] args) {
        B0 b0=new B0();
        Thread t1=new Thread(b0);
        t1.setName("A");
        t1.start();

        B0 b1=new B0();
        Thread t2=new Thread(b1);
        t2.setName("B");
        t2.start();

    }

}
class B0 implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
