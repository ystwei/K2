package com.weikun.B;

/**
 * Created by Administrator on 2016/11/20.
 */
public abstract class Car {
    public abstract int getR();//半径
    public abstract int getS();//转速
    public  double compute(){
        //半径*2*Math.PI*转速
        return 2*getR()*Math.PI*this.getS();
    }
}
class Auto extends Car{

    @Override
    public int getR() {
        return 2;
    }

    @Override
    public int getS() {
        return 9;
    }
}
class Audi extends Car{

    @Override
    public int getR() {
        return 8;
    }

    @Override
    public int getS() {
        return 5;
    }
}
