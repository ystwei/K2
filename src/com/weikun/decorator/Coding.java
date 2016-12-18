package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Coding extends GirlDecorator {
    private Girl girl;
    public Coding(Girl girl){
        this.girl=girl;
    }

    @Override
    public String getDesc() {
        return this.girl.getDesc()+"£»²¢ÇÒ»á±àÂë£¡";
    }
}
