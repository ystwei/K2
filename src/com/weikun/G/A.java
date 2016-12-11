package com.weikun.G;

import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2016/12/10.
 */
public class A {
    @Test
    public void test1(){
        Vector v=new Vector();
        v.add("A");
        v.add("B");



        v.add("C");




        Enumeration es=v.elements();
        while(es.hasMoreElements()){
            System.out.println(es.nextElement());
        }

    }
    @Test
    public void test() {
        List list = new ArrayList();//��̬--�鷽������

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");//int --Integer--Object
        list.add(2,"E");
        list.remove("C");
        //1
        Iterator it = list.iterator();//

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------");
        //2
        for (Object o : list) {
            System.out.println(o);

        }
        System.out.println("------------");
        //3
        ListIterator it1 = list.listIterator();//next previous

        while (it1.hasNext()) {
            System.out.println(it1.next());

        }
        while (it1.hasPrevious()) {
            System.out.println(it1.previous());

        }
        System.out.println("------------");
        //4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("------------");

        Object[] os = list.toArray();

        for (int i = 0; i < os.length; i++) {
            System.out.println(os[i]);

        }


    }
}
