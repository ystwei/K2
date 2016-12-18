package com.weikun.command;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Test {
    public static void main(String[] args) {
        Receiver rec=new Receiver();

        Command command=new ConcreteCommand(rec);
        Invoker i=new Invoker();
        i.go(command);
    }
}
