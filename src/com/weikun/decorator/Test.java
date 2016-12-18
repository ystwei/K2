package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        Girl girl=new Americal();
        System.out.println(girl.getDesc());

        Coding c=new Coding(girl);

        System.out.println(c.getDesc());


        Art a=new Art(c);
        System.out.println(a.getDesc());

    }


}
