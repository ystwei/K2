package com.weikun.D;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/27.
 */
public class G {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,5));
//
//

        System.out.println((int)'��');
        System.out.println((int)'è');
        System.out.println((int)'��');
        Animal [] as={
                new Animal(10,"��","zhu"),
                new Animal(10,"è","mao"),
                new Animal(12,"è","mao"),
                new Animal(20,"��","yu")};
        Arrays.sort(as);
        System.out.println(Arrays.binarySearch(as,new Animal(12,"è","mao")));
        // System.out.println(as[0].getName());
        //System.out.println(as[1].getName());

//        for(int i=0;i<as.length;i++){
//            System.out.println(as[i].getName());
//        }
        for(Animal a1 :as){
            System.out.println(a1.getName());
        }

    }
}
