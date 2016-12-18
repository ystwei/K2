package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */
public abstract class Subject {

    private List<Observer> list=new ArrayList();

    public void attatch(Observer o){//增加观察者
        list.add(o);

    }
    public void detach(Observer o){//删除观察者
        list.remove(o);
    }

    public void Notify(){//遍历每个观察者
        for(Observer o :list){
            o.update();

        }

    }


}
