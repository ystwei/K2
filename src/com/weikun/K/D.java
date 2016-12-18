package com.weikun.K;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/12/17.
 */
public class D {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(10);

        for(int i=0;i<11;i++){
            Future<String> fs=es.submit(new Callable<String>() {

                @Override
                public  String call() throws Exception {

                    return Thread.currentThread().getName()+"Ω· ¯¡À£°";
                }
            });
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
