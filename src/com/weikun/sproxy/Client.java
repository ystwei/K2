package com.weikun.sproxy;

import java.security.cert.CertPathValidatorException;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Client {
    public static void main(String[] args) {
        RealSubject subject=new RealSubject();
        Proxy p=new Proxy(subject);
        p.say();
        p.go();
        p.make();
    }
}
