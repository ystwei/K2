package com.weikun.G;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/10.
 */
public class G {
    @Test
    public void test(){
        Set<String> s=new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("D");

        Iterator it=s.iterator();

        while( it.hasNext()){
            System.out.println(it.next());
        }

    }
}
