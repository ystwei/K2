package com.weikun.E;

/**
 * Created by Administrator on 2016/11/27.
 */
public class B {
    public static void main(String[] args) {
        try {//尝试走
            System.out.print(1/0);

        } catch (RuntimeException e) {//错了走
            e.printStackTrace();

        } catch (Exception e) {//错了走
            e.printStackTrace();

        }finally {//必须走
            System.out.print("ok");

        }
    }
}
