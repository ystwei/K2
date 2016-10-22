/**
 * Created by Administrator on 2016/10/22.
 */
public class C {
    public static void main(String[] args) {
        //System.out.println('我'+"在哈尔滨"+'A'*2);
//        float f=1.1f;
//        byte b=100;//-128--127
//        char c= (char)b;//0--65535
//
//        byte b1=(byte)129;
//        System.out.println(b1);
//        byte b=9;
//       // char c=b;  //能否转换为char类型
//        double d=b;
//        System.out.println(d);//输出什么？
//        short s=10;
//        s=(short)(s+2);
        byte b=25;
        char c='a';
        int i=23;
        double d=.3;
        //右边表达式中在最高等级操作数为duble类型，
        //则右边表达式的类型为double型，故付给一个double型变量
       // float result=(float)(b+c+i*d);
        String s=b+c+i*d+"";
        System.out.println(s);

    }
}
