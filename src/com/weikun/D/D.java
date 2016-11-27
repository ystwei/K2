package com.weikun.D;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/11/26.
 */
public class D {
    public static void main(String[] args) {
        int i=100;
        String s=String.valueOf(1);

        System.out.println(s);
        String s1="90";
        int j=Integer.parseInt("90");
        System.out.println(j);
        //gb2312<gbk<gb18030<utf-8
        //big5
        //iso8859-1:拉丁文
//        try {
//            String s3=new String("我爱你们".getBytes("ISO8859-1"),"GB2312");
//            System.out.print(s3);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        String s4="ABC";
        String s5="123";
        String s6=new String("abc");
        System.out.println(s4==s6);
        System.out.println(s4.equals(s6));

        System.out.println(s4.equalsIgnoreCase(s6));
    }
}
