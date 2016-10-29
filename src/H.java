/**
 * Created by Administrator on 2016/10/29.
 */
public class H {

    public static void main(String[] args) {
//        int old1=100;
//        String name1="rose";
//        ok(old1,name1);

        getArea1();

        getArea2(10,20);

        System.out.println(getArea3());
        System.out.print(getArea4(10,20));
    }
    static void getArea1(){//无参，无返回
        int h=10;
        int d=20;
        System.out.println("三角形面积是:"+h*d/2);
    }
    static void getArea2(int h,int d){//有参，无返回
        System.out.println("三角形面积是:"+h*d/2);
    }
    static float getArea3() {//无参，有返回
        int d=10;
        int h=20;
        return d*h/2.0f;
    }
    static float getArea4(int d,int h) {//有参，有返回
        return d*h/2.0f;
    }
}
