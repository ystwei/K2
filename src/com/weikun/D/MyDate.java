package com.weikun.D;

/**
 * Created by Administrator on 2016/11/26.
 */
public class MyDate {
    private int month;
    private int year;
    private int day;
    private String sex;

    public MyDate( int year,int month, int day,String sex) {
        this.month = month;
        this.year = year;
        this.day = day;
        this.sex=sex;

    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
           return true;
        }
        if(obj==null){//obj没堆 this是有堆的对象
            return false;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        MyDate d=(MyDate)obj;
        if((this.day!=d.day)||(this.month!=d.month)||(this.year!=d.year)||
                (!this.sex.equals(d.sex))){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyDate m=new MyDate(2016,11,26,"男");
        MyDate m1=new MyDate(2016,11,26,"女");
        System.out.print(m.equals(m1));
    }
}
