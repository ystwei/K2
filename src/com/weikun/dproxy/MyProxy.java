package com.weikun.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyProxy implements InvocationHandler {
    private Object obj;
    public MyProxy(Object obj){

        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理器之前运行");
        method.invoke(obj,args);
        System.out.println("代理器之后运行");
        return obj;//调用核心方法
    }
}
