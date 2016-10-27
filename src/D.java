/**
 * Created by Administrator on 2016/10/27.
 */
public class D {
    public static void main(String[] args){
       // System.out.println(17/0);//
       // System.out.println(17.1 % 4);//求余
       // System.out.println("17 mod 4 = "+17%4);
       // System.out.println("17 mod 4 = "+17.0%4);
       // System.out.println("17 mod 4 = "+17%0);
//        System.out.println("17 mod 4 = "+ -17.0%0);//NAN: Not a Number
//        System.out.println( -5% 2);
//        System.out.println( 5% -2);
//        System.out.println( -5% -2);//符号看分子


//        int a=1;
//        int b=2;
//        //    1+2+2+
//        int c=a+++2+a--+-b---a;
//        System.out.println("a的值为："+a);
//        System.out.println("b的值为："+b);
//        System.out.println(c);

//        int a=2;
//        int b=a+3*a++;
//        System.out.println("a的值为："+a);
//        System.out.println("b的值为："+b);
//        System.out.println('A'/2.0);
          System.out.println("5和5.0是否相等：" + (5== 5.0));
          System.out.println(~0b0011);//  1100----1011 ---0100
          System.out.println(~2);//0010--->1101----1100---0011
          System.out.println(2&3);//0010&0011=0010
        System.out.println(2|3);//0010|0011=0011
        System.out.println(2^3);//0010^0011=0001
        System.out.println(71>>4);// 0010 00>>2=0000 1000  71/2(4)=4
        System.out.println(64>>>4);//无符号右移
        System.out.println(2<<2);//atom
      //  System.out.println(2<<4);// 0000 0010<<4=0010 0000=2*2(4)=32
        //梅 a0 b1 c3
        //赵洋 a0 b1 c2
        //刘 a0 b1 c3
    }

}
