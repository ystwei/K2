package com.weikun.G;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/10.
 */
public class Cart {
    private List<Goods> list=new ArrayList<>();

    public List<Goods> getList() {

        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }
}
