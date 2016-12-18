package com.weikun.I;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/12/11.
 */

public class G{
    public static void main(String[] args) {
        Timer timer=new Timer();
        G0 g0=new G0(10,timer);
        timer.schedule(g0,1,1000);
    }
}
class G0 extends TimerTask{
    public G0(){}
    public G0(int imgCount, Timer timer) {
        this.imgCount = imgCount;
        this.timer = timer;
    }

    private int imgIndex;//每张图片索引号
    private int imgCount;//总共图片的个数
    private Timer timer;//计时器
    @Override
    public void run() {
        if(++imgIndex<=imgCount){//当前图片索引号小于总共的数量，
            System.out.println("游戏正在加载图片:"+imgIndex);

        }else{
            System.out.println("游戏加载成功！");
            timer.cancel();//关闭计数器
        }
    }
}
