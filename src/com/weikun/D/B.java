package com.weikun.D;

import java.util.Random;

/**
 * Created by Administrator on 2016/11/26.
 */
public class B {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(2.1));//向上取整：比他大的最小整数，double。
//        System.out.println(Math.floor(3.7));//向下取整：比他小的最大整数，double
//
//        System.out.println(Math.pow(2,7));//求n次幂

//        for(int i=20000;i<30000;i++){
//            //a-z 20000-29999
//           // System.out.print((char)(Math.random()*10000+20000));//[20000,30000)
//            System.out.print((char)i);//[20000,30000)
//        }

        Random r=new Random();
        for(int i=0;i<5;i++) {
            System.out.println(r.nextInt(6)+15); //15 20
        }

    }
}
