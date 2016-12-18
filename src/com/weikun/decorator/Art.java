package com.weikun.decorator;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Art extends GirlDecorator {
    private Girl girl;
    public Art(Girl girl){
        this.girl=girl;
    }
    @Override
    public String getDesc() {
        return this.girl.getDesc()+"£»»á»­»­£¡";
    }
}
