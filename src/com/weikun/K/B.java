package com.weikun.K;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/11.
 */
public class B {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        ExecutorService service= Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){

            service.execute(new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"启动了！");
                }
            });
        }
        service.shutdown();
        try {
            service.awaitTermination(Long.MAX_VALUE , TimeUnit.DAYS);
            System.out.println("完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
