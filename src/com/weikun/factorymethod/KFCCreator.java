package com.weikun.factorymethod;


/**
 * Created by Administrator on 2016/12/17.
 */
public class KFCCreator implements Creator {
    @Override
    public IProduct sale() {
        return new KFCProduct();

    }
}
