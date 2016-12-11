package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class F {
    public static void main(String[] args) {
        F0 f0 =new F0();
        f0.setName("A");
        f0.start();

        F0 f2 =new F0();
        f2.setName("C");
        f2.start();

        F1 f1 =new F1();
        f1.setName("B");
        f1.setDaemon(true);
        f1.start();

        F1 f3 =new F1();
        f3.setName("D");
        f3.setDaemon(true);
        f3.start();
    }

}
class F0 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+":"+i);

        }
    }
}

class F1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+":"+i);

        }
    }
}
