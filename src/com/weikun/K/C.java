package com.weikun.K;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/17.
 */
public class C {
    public static void main(String[] args) {
        //ExecutorService es= Executors.newFixedThreadPool(10);
        //ExecutorService es= Executors.newSingleThreadExecutor();
        ExecutorService es= Executors.newCachedThreadPool();
        for(int i=0;i<11;i++){
           es.submit(new Runnable(){
               @Override
               public void run() {
                   System.out.println(Thread.currentThread().getName()+"启动了！");
               }
           });
        }
        es.shutdown();
        try {
            es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);//无限期的等待池中所有线程关闭
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
