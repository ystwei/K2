/**
 * Created by Administrator on 2016/10/27.
 */
public class F {
    public static void main(String[] args) {
//        int i=10;
//        short j=2;
//        j+=i;//赋值扩展运算符，不检查数据类型，速度快 不安全
//        j=(short)(j+i);//运算符，检查数据类型 速度慢 安全 造型
//        System.out.print(j);
//        int a=5;
//        int b=3;
//        int c=10;
//        int d=20;
//        System.out.println( (a>b)&(c<d) ? "正确":"失败" );
//        //闰年
        int year=2000;//能被4整除，且不能被100整除 或直接能被400整除的数就是
        System.out.println( (((year%4==0 )&&(year%100!=0))||(year%400==0))?"闰年":"平年" );

    }
}
