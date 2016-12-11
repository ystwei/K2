package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class E {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (i == 100) {
                E0 e1 = new E0();
                Thread t2 = new Thread(e1);
                t2.setName("B");
                t2.start();
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                E0 e2 = new E0();
                Thread t3 = new Thread(e2);
                t3.setName("C");
                t3.start();


            }
            System.out.println(i);
        }
//        E0 e0=new E0();
//
//        Thread t1=new Thread(e0);
//        t1.setName("A");
//        t1.start();


    }
}

class E0 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);

        }
    }
}
