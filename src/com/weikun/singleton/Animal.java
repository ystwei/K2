package com.weikun.singleton;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Animal {
    private Animal() {

    }

    private static Animal animal;

    public static synchronized Animal getInstance() {//ÊµÀý

        if (animal == null) {
            animal = new Animal();
        }


        return animal;
    }
}
