package com.weikun.D;

/**
 * Created by Administrator on 2016/11/27.
 */
public class Animal implements Comparable {
    private int age;
    private String name;
    private String pinyin;

    public Animal() {
    }

    public Animal(int age, String name, String pinyin) {
        this.age = age;
        this.name = name;
        this.pinyin = pinyin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {

        Animal a = (Animal) o;

        return this.age - a.age == 0 ? this.pinyin.compareTo(a.pinyin) : this.age - a.age;
    }
}

