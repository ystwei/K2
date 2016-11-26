package com.weikun.D;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Administrator on 2016/11/26.
 */
public class A {
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 D w E HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+9"));

        System.out.println(sdf.format(new Date()));


//        Calendar calendar=Calendar.getInstance();
//        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//
//        System.out.println(calendar.get(Calendar.YEAR));//
//        System.out.println(calendar.get(Calendar.MONTH)+1);//
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//
//
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//
//        System.out.println(calendar.get(Calendar.MINUTE));//
//        System.out.println(calendar.get(Calendar.SECOND));//


//        calendar.add(Calendar.YEAR,0);
//
//        calendar.add(Calendar.MONTH,24);
//        System.out.println(calendar.getTime());



    }
}
