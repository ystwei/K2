package com.weikun.C;

/**
 * Created by Administrator on 2016/11/20.
 */
public enum ESeason {
    SPRING,SUMMER,FALL,WINTER;//public static final
    void go(){
        switch (this){
            case SPRING:
                System.out.print("��ů����");
                break;
            case FALL:
                System.out.print("��");
                break;
            case WINTER:
                System.out.print("�������");
                break;
            case SUMMER:
                System.out.print("����");
                break;
        }

    }
}
