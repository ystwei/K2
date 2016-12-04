package com.weikun.F;


import org.junit.Test;
import org.weikun.Animal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/4.
 */
public class F {
    public static void main(String[] args) {
        reflectObject();

    }
    public static void ok(String name,int ...i){

    }
    @Test
    public void reflectArray() {//反射数组

        Object o=Array.newInstance(String.class,4);
        Array.set(o,0,"A");
        Array.set(o,1,"B");
        Array.set(o,2,"C");
        System.out.println(Array.get(o,2));
    }


    @Test
    public void reflectField() {//反射属性
        String s="org.weikun.Animal";
        try {
            Class c=Class.forName(s);
            Constructor cs=c.getConstructor(int.class,String.class);
            Object o=cs.newInstance(100,"北京");

            Field  f=c.getDeclaredField("name");
            f.setAccessible(true);
            f.set(o,"上海");
            System.out.print(f.get(o));
//            Field fs[]=c.getDeclaredFields();//访问属性
//            for(Field f :fs){
//                System.out.println(f.getName());
//            }




        } catch (Exception e) {
            e.printStackTrace();
        }



    }



    @Test
    public void reflectMethod() {//反射方法
        String s="org.weikun.Animal";
        try {
            Class c=Class.forName(s);
            Constructor cs=c.getConstructor(int.class,String.class);
            Object o=cs.newInstance(100,"北京");
            Method m1=c.getMethod("setName",String.class);
            m1.invoke(o,"上海");
            Method m=c.getMethod("getName");
            System.out.println(m.invoke(o));
//            Method ms[]=c.getMethods();
//
//            for(Method m :ms){
//                System.out.println(m.getName());
//            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void reflectObject1() {//反射非默认构造器
        String s="org.weikun.Animal";
        try {
            Class c=Class.forName(s);
            Constructor cs=c.getConstructor(int.class,String.class);
            Animal a=(Animal)cs.newInstance(100,"北京");


            System.out.println(a.getName()+a.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reflectObject() {//反射默认构造器
        String s="org.weikun.Animal";
        try {
            Class c=Class.forName(s);
            Animal o=(Animal)c.newInstance();

            o.setName("狗");
            System.out.println(o.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
