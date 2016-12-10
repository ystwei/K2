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
        Cart c=new Cart();//��
        list=c.getList();
    }
    /**
     *
     * @param newGoods ����Ʒ
     */
    public List buy(Goods newGoods){

        Iterator<Goods> it=list.iterator();
        boolean flag=false;
        while(it.hasNext()){
            Goods oldGoods=it.next();//�õ�ÿ�����ﳵ����Ʒ
            if(newGoods.getNo().equals(oldGoods.getNo())){//�����ȣ�����������Ʒ
                //��������Ʒ����
                oldGoods.setQuantity(newGoods.getQuantity()+oldGoods.getQuantity());
                flag=true;
                break;
            }
        }
        if(!flag){//������Ʒ
            list.add(newGoods);
        }
        return list;
    }
    @Test
    public void test(){
        Goods g1=new Goods("ţ��","0001",10,1);
        this.buy(g1);
        Goods g2=new Goods("ţ��","0001",10,2);
        this.buy(g2);
        Goods g3=new Goods("��ţ","0002",100,2);
        this.buy(g3);
        Goods g4=new Goods("����","0003",20,3);
        List<Goods> list=this.buy(g4);
        for(Goods g :list ){
           //���ܷǳ���
            System.out.println(g.getName()+":"+g.getPrice()*g.getQuantity());
        }

    }
}
