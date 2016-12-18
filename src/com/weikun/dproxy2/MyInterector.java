package com.weikun.dproxy2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/18.
 */
public class MyInterector implements MethodInterceptor {
    public Object getObject(Class cs){

        Enhancer en=new Enhancer();
        en.setSuperclass(cs);
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("之前");
        Object o1=methodProxy.invokeSuper(o,objects);
        System.out.println("之后");
        return o1;
    }
}
