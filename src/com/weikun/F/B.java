package com.weikun.F;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2016/12/3.
 */
public class B {
    @Test
    public void readerFile1(){
        File file=new File("c://33.txt");
        try (Reader r=new FileReader(file);){

            char [] buffer=new char[1024];
            int n=-1;
            while((n= r.read(buffer))!=-1){
                System.out.print(new String(buffer));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Test
    public void copyFile1(){
        File file=new File("c://44.txt");
        File file1=new File("f://44.txt");
        try (  Reader r=new FileReader(file);
                Writer w=new FileWriter(file1);){

            int n=-1;
            char[] buffer=new char[1024];

            while( (n=r.read(buffer))!=-1){
                w.write(buffer,0,n);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    @Test
    public void writeFile1(){
        File file=new File("c://44.txt");
        try (Writer w=new FileWriter(file);){

           w.write("你好");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    @Test
    public void makeDic(){
        File file=new File("c://1.txt");
        try {
            //file.createNewFile();
           // file.mkdir();
           System.out.print(file.isFile());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void copyFile(){

        try(

                FileInputStream fis=new FileInputStream("D://zj.rmvb");
                FileOutputStream fos=new FileOutputStream("C://1.rmvb");

                ) {

            int n=-1;
            byte buffer[]=new byte[1024*1024*10];
            long start=System.currentTimeMillis();
            while((n=fis.read(buffer))!=-1){
                fos.write(buffer,0,n);
            }
            long end=System.currentTimeMillis();

            SimpleDateFormat sf=new SimpleDateFormat("mm:ss");
            System.out.println(sf.format(end-start));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    @Test
    public void writeFile() {
        try (FileOutputStream fos=new FileOutputStream("c://33.txt")){

            fos.write("你好，世界".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void readFile() {

        try ( FileInputStream fis=new FileInputStream("1.txt")){


            byte[] buffer=new byte[1024];//1.1K
            int n=-1;
            while( (n=fis.read(buffer))!=-1){
                System.out.println(new String(buffer));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
