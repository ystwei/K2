package com.weikun.G;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/10.
 */
public class Goods implements Serializable {
    public Goods(){}
    public Goods(String name, String no, float price, int quantity) {
        this.name = name;
        this.no = no;
        this.price = price;
        this.quantity = quantity;
    }
    private String name;
    private String no;
    private float price;
    private int quantity;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
