package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Animal1 {
    private Animal1(){}
    public static class Animal1Holder{
        private static final Animal1 a=new Animal1();
    }
    public static Animal1 getInstance(){
        return Animal1Holder.a;
    }
}
