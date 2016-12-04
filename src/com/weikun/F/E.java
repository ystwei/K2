package com.weikun.F;

import org.junit.Test;

import java.io.File;

/**
 * Created by Administrator on 2016/12/4.
 */
public class E {
    @Test
    public void mark(){
        String path="c://";
        go(path);
    }

    public void go(String path){
        File file=new File(path);
        File [] fs=file.listFiles();
        for( File f :fs){
            if(f.isDirectory()){
                go(f.getPath());
            }
            System.out.println(f.getPath());

        }

    }
    public static void main(String[] args) {
        File file=new File("c://","1.txt");
    }
}
