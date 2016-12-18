package com.weikun.F;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/12/3.
 */
public class A {
    public static void main(String[] args) {
        //判断任何合法的2位小数 ，整数也可以 9.99  9   99.99  .99
//        System.out.println(Pattern.matches("^[0-9]+(\\.[0-9]{2})?$",".99"));
//
//
//        String regex = "^[\\w]{1,3}$";
//        System.out.println(Pattern.matches(regex,"w2"));
//
//        String r1="^[\u4e00-\u9fa5]{0,}$";
//
//        String r2="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
//        int i='\u9fa5';
//        System.out.println(i);
//        System.out.println(Pattern.matches(r1,"4"));





        String str="Hello Java";

        // System.out.println(str.replaceFirst("\\w*", "■"));//■,Java
        System.out.println(str.replaceFirst("\\w*", "■"));

//        String str="heloWorldw";
//
//        System.out.println(str.replaceFirst("\\w{3,4}", "■"));//
//
//        System.out.println(str.replaceAll("\\w{3,4}?", "■"));
    }
}
