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

    private int imgIndex;//ÿ��ͼƬ������
    private int imgCount;//�ܹ�ͼƬ�ĸ���
    private Timer timer;//��ʱ��
    @Override
    public void run() {
        if(++imgIndex<=imgCount){//��ǰͼƬ������С���ܹ���������
            System.out.println("��Ϸ���ڼ���ͼƬ:"+imgIndex);

        }else{
            System.out.println("��Ϸ���سɹ���");
            timer.cancel();//�رռ�����
        }
    }
}
