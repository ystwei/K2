package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */
public abstract class Subject {

    private List<Observer> list=new ArrayList();

    public void attatch(Observer o){//���ӹ۲���
        list.add(o);

    }
    public void detach(Observer o){//ɾ���۲���
        list.remove(o);
    }

    public void Notify(){//����ÿ���۲���
        for(Observer o :list){
            o.update();

        }

    }


}
