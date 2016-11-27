package com.weikun.D;

/**
 * Created by Administrator on 2016/11/27.
 */
public class F {
    public static void main(String[] args) {

//        System.out.println("125".compareTo("123"));
//        System.out.println("abc".startsWith("ac"));
//        System.out.println("abc".endsWith("ab"));
        //System.out.println("ABCDEAACC".indexOf("A",2));
      //  System.out.println("ABCDEABACC".lastIndexOf("AB",6));
        //System.out.println(" A B ".trim());

        System.out.println("ABCDEFG".substring(2));
        System.out.println("ABCDEFG".toLowerCase().toUpperCase().substring(2,4));

        String [] cs="abc=def%ghi".split("=");
        System.out.print(cs[0]+"--");
        String cs1[]=cs[1].split("%");
        System.out.print(cs1[0]+"--");
        System.out.print(cs1[1]+"--");
    }
}
