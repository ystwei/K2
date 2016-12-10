package com.weikun.G;

import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2016/12/10.
 */
public class E {
    @Test
    public void test(){
        HashMap <String,Integer>map=new HashMap();

        map.put("a",100);
        map.put("b",200);
        map.put("c",300);
        Collection<Integer> cs=map.values();
        for(Integer v  :cs){
            System.out.println(v);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,Integer>  s:list){
            System.out.println(s.getKey()+":"+s.getValue());

        }



    }
}
