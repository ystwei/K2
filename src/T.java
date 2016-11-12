import java.util.Date;

/**
 * Created by Administrator on 2016/11/12.
 */
public class T {
    public static void main(String[] args) {
//        T t=new T();
//        int m=10;
//        t.half(m);
//        System.out.print(m);

        T t=new T();
        Date d=new Date();
        System.out.print(d);
        t.half1(d);
        System.out.print(d);
    }
    void half1(Date d){//引用类型做形参，传递的是地址，就是自己，引用传递
        d.setYear(113);//设置年 1900+?

    }
    void half(int m){//基本类型做形参，传递的是值，不是自己，值传递
        m=m/2;
        System.out.print(m);
    }
}
