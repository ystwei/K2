package com.weikun.G;

import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2016/12/10.
 */
public class D {
    @Test
    public void test(){

        HashMap map=new HashMap();
        map.put(null,"A");
        map.put(null,null);


        Collection<String> cs=map.values();
        for(String v  :cs){
            System.out.println(v);
        }

//        Hashtable<String,String> t=new Hashtable<>();
//        t.put("A","a");
//        t.put("B","b");
//        t.put("C","c");
//        t.put(null,null);
//        Collection<String> cs=t.values();
//        for(String v  :cs){
//            System.out.println(v);
//        }
//        System.out.println("------------");
//        Enumeration<String> es=t.keys();
//        while( es.hasMoreElements()){
//            String key=es.nextElement();
//            System.out.println(key+"--"+ t.get(key));
//        }
//        System.out.println("------------");
//        Enumeration<String> ev=t.elements();
//        while( ev.hasMoreElements()){
//            System.out.println(ev.nextElement());
//        }
//        System.out.println("------------");
//        Set<String> ss=t.keySet();
//        Iterator<String> it=ss.iterator();
//        while(it.hasNext()){
//            System.out.println(t.get(it.next()));
//        }
//        System.out.println("------------");
//        Set<Map.Entry<String,String>> se=t.entrySet();
//        Iterator<Map.Entry<String,String>> it2=se.iterator();
//        while(it2.hasNext()){
//            Map.Entry<String,String> e=it2.next();
//            System.out.println(e.getKey()+":"+e.getValue());
//        }

    }
}
