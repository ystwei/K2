package com.weikun.B;

/**
 * Created by Administrator on 2016/11/20.
 */
public interface IA extends IA1,IA2 {

    void go();
}
interface IA2 {
    void mark1();
}
interface IA1{
    void mark();
}
class D1{
    void plan(){

    }
}
class  D  extends D1 implements IA{

    @Override
    public void go() {

    }

    @Override
    public void mark() {

    }

    @Override
    public void mark1() {

    }
}

