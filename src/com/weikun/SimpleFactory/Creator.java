package com.weikun.SimpleFactory;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Creator {//��ͻ�


    public IProduct go(int i){
        switch (i){
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
            default:
                return null;
        }

    }
}
