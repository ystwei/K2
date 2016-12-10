package com.weikun.G;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/10.
 */
public class C {
    @Test
    public void test(){
        LinkedList list=new LinkedList();
//        list.add(1);
//        list.addFirst(2);
//        list.addLast(3);
//        list.add(4);
//        list.push(5);
//        list.offer(6);
//        list.offerFirst(7);
//        list.offerLast(8);
//        list.addFirst(9);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);
        list.add(6);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println("pop:"+list.pop());//poll pop peek
        System.out.println("poll:"+list.poll());//poll pop peek
        System.out.println("peek:"+list.peek());
        list.peekFirst();
        list.peekLast();
        list.pollFirst();
        list.pollLast();

        list.remove(new Integer(4));
        list.removeFirst();

//        list.removeLast();
//        list.removeFirst();

        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
