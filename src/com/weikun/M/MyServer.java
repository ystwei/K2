package com.weikun.M;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyServer {

    public static void main(String[] args) {
        ServerSocket server= null;


        File file=new File("c://���1.txt");
        DataInputStream dis=null;
        DataOutputStream dos=null;
        Socket client=null;
        try {
            server = new ServerSocket(8221);
            FileInputStream fis=new FileInputStream(file);
            dis=new DataInputStream(fis);
            client=server.accept();
            dos=new DataOutputStream(client.getOutputStream());
            //д�ļ�����
            dos.writeUTF(file.getName());
            dos.flush();//��ջ���
            //д�ļ�
            int n=-1;
            byte[]buffer=new byte[1024];

            while( ((n=dis.read(buffer))!=-1)){
                dos.write(buffer,0,n);
            }

            dis.close();
            dos.flush();
            dos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
