package com.weikun.G;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/12/10.
 */
public class B {
    private List<Goods> list;
    public B(){
        Cart c=new Cart();//车
        list=c.getList();
    }
    /**
     *
     * @param newGoods 新商品
     */
    public List buy(Goods newGoods){

        Iterator<Goods> it=list.iterator();
        boolean flag=false;
        while(it.hasNext()){
            Goods oldGoods=it.next();//得到每个购物车老商品
            if(newGoods.getNo().equals(oldGoods.getNo())){//如果相等，代表有老商品
                //更改老商品数量
                oldGoods.setQuantity(newGoods.getQuantity()+oldGoods.getQuantity());
                flag=true;
                break;
            }
        }
        if(!flag){//纯新商品
            list.add(newGoods);
        }
        return list;
    }
    @Test
    public void test(){
        Goods g1=new Goods("牛奶","0001",10,1);
        this.buy(g1);
        Goods g2=new Goods("牛奶","0001",10,2);
        this.buy(g2);
        Goods g3=new Goods("奶牛","0002",100,2);
        this.buy(g3);
        Goods g4=new Goods("咖啡","0003",20,3);
        List<Goods> list=this.buy(g4);
        for(Goods g :list ){
           //性能非常慢
            System.out.println(g.getName()+":"+g.getPrice()*g.getQuantity());
        }

    }
}
