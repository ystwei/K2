package com.weikun.L;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyServer {
    public static void main(String[] args) {
        ServerSocket ss=null;
        Socket client=null;
        BufferedReader br=null;
        try {
            ss=new ServerSocket(9081);
            client=ss.accept();

            br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag=true;
            while(flag){

                String txt=br.readLine().trim();
                if(txt.toUpperCase().equals("EXIT")){//是否客户端说退出
                    System.out.println("她退出了！");
                    flag=false;
                }else{
                    System.out.println(txt);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                client.close();
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



}
