package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class A {
    public static void main(String[] args) {
        A0 a0=new A0();
        a0.setName("A");
        a0.start();//在用户线程运行

        A0 a1=new A0();//在用户线程运行
        a1.setName("B");
        a1.start();
    }

}
class A0 extends Thread{
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
