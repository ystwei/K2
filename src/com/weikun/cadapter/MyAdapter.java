package com.weikun.cadapter;

/**
 * Created by Administrator on 2016/12/17.
 */
public class MyAdapter extends Chapai implements Telphone {
    private Chapai c=new Chapai();//对象适配器模式
    @Override
    public void tel() {
        super.chongdian();
    }
}
