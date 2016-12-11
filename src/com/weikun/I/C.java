package com.weikun.I;

/**
 * Created by Administrator on 2016/12/11.
 */
public class C {
    public static void main(String[] args) {
        new Thread(new Runnable(){
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
        }).start();
        new Thread(new Runnable(){
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
        }).start();
    }
}

