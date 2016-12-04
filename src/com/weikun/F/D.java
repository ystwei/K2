package com.weikun.F;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Test;

import java.io.*;

/**
 * Created by Administrator on 2016/12/4.
 */
public class D {
    @Test
    public void go(){
        int a=100;
        int b=128;
        int c=80;
        int d=80;

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        out.write(a);
        out.write(b);
        out.write(c);
        out.write(d);

        byte[] buffer=out.toByteArray();

//        for(int i=0;i<buffer.length;i++){
//
//            System.out.println(buffer[i]);
//        }

        ByteArrayInputStream bis=new ByteArrayInputStream(buffer);
        int n=-1;
        try {
            bis.read(buffer);
            for(int i=0;i<buffer.length;i++){
                System.out.println(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void merge(){
        RandomAccessFile in=null;
        RandomAccessFile out=null;
        File file=new File("c://2.jpg");
        try {

            in=new RandomAccessFile("c://1.jpg","r");
            out=new RandomAccessFile(file,"rw");

            int n=-1;
            byte[] buffer=new byte[1024];
            out.seek(file.length());//定位到该文件的末尾

            while((n=in.read(buffer))!=-1){
                out.write(buffer,0,n);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally{

            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void copy() {
        RandomAccessFile in=null;
        RandomAccessFile out=null;
        try {
            in=new RandomAccessFile("c://44.txt","r");//输入流
            out=new RandomAccessFile("d://44.txt","rw");//输出流
            int n=-1;
            byte[] buffer=new byte[1024];
            while( (n=in.read(buffer))!=-1){
                out.write(buffer,0,n);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

