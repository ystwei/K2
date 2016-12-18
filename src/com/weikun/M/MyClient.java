package com.weikun.M;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyClient {
    public static void main(String[] args) {
        Socket s=null;
        DataInputStream dis=null;
        DataOutputStream dos=null;
        try {
            s=new Socket("127.0.0.1",8221);

            dis=new DataInputStream(s.getInputStream());
            String filename=dis.readUTF();//取文件名
            File file=new File("d://"+filename);

            dos=new DataOutputStream(new FileOutputStream(file));
            int n=-1;
            byte[] buffer=new byte[1024];
            while( ((n=dis.read(buffer))!=-1)){
                dos.write(buffer,0,n);
            }

            dis.close();
            dos.flush();
            dos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
