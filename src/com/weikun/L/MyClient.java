package com.weikun.L;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyClient{
    public static void main(String[] args) {
        //发送端
        Socket client=null;
        try {
            client=new Socket("127.0.0.1",9081);
            PrintWriter out=new PrintWriter(client.getOutputStream(),true);//true：让他自动flush
            Scanner sc=new Scanner(System.in);

            while(sc.hasNext()){
                out.println(sc.nextLine());
            }
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


}
