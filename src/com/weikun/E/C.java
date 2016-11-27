package com.weikun.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2016/11/27.
 */
public class C extends C0{
    public static void main(String[] args) {


        try {
            new C().ok();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void ok()  {
        int i=200;
        if(i==100){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void go() throws RuntimeException {

    }
}
class C0{
    public void go() throws Exception{

    }
}
