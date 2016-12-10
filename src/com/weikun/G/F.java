package com.weikun.G;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2016/12/10.
 */
public class F {

    @Test
    public void test(){
        Properties pro=new Properties();
        File file=new File("my.ini");
        try {
            pro.load(new FileInputStream(file));

            Object o=pro.get("B");

            Class c=Class.forName(o.toString());

            System.out.println(c.newInstance());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
