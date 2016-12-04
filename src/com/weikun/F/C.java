package com.weikun.F;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/4.
 */
public class C {
    public static void main(String[] args) {
        new C().in();
    }
    public void in2(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try {
                String line=br.readLine();
                if(line.trim().toUpperCase().equals("Q")){//quit
                    break;
                }
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
    public void in1(){
        Scanner sc=new Scanner(System.in);
        while(true){
            String txt=sc.nextLine();
            System.out.println(txt);
            if(txt.trim().toUpperCase().equals("Q")){//quit
                break;
            }
        }
        sc.close();
    }
    @Test
    public void in(){

        InputStream is=System.in;
        while(true){
            byte[] buffer=new byte[1024];
            try {
                is.read(buffer);
                String line=new String(buffer).trim();

                if(line.toUpperCase().equals("Q")){//quit
                    break;
                }
                System.out.print(line);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    @Test
    public void copy(){
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c://ideaIU-2016.3.exe"),1024*1024*5);

            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d://1.txt"),1024*1024*5)) {
            byte[] buffer=new byte[1024*1024];//建立个捯饬的地
            int n=-1;
            while((n=bis.read(buffer))!=-1 ){
                bos.write(buffer,0,n);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
