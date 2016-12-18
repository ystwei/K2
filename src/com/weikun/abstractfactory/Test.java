package com.weikun.abstractfactory;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Test {
    public static void main(String[] args) {
        new ConcreteFactoryA().go().plan();
        new ConcreteFactoryB().go().ok();
    }
}
