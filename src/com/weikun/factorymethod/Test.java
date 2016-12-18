package com.weikun.factorymethod;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        new MCDCreator().sale().myProduct();

        new KFCCreator().sale().myProduct();
    }
}
