package com.weikun.command;

/**
 * Created by Administrator on 2016/12/17.
 */
public class Invoker {

    public void go(Command command){
        command.execute();
    }
}
