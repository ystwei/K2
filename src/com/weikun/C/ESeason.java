package com.weikun.C;

/**
 * Created by Administrator on 2016/11/20.
 */
public enum ESeason {
    SPRING,SUMMER,FALL,WINTER;//public static final
    void go(){
        switch (this){
            case SPRING:
                System.out.print("春暖花开");
                break;
            case FALL:
                System.out.print("秋");
                break;
            case WINTER:
                System.out.print("冬天很美");
                break;
            case SUMMER:
                System.out.print("夏日");
                break;
        }

    }
}
