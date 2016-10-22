/**
 * Created by Administrator on 2016/10/22.
 */
public class A {

    public static void main(String[] args) {
        int i=100;//10进制
        int i1=0xFF;//0---9 A---F [0,15] 0000 0000  0000 0001
        int i2=8;

        int i3=0b1000;
        short s=200;
        String s1="北京";

        System.out.println(i3);
        long l=200L;//long == int: 自动转换
        float f=1.1f;//纯float 32bit
        double d=1.123456;//BigDecimal
        boolean b=true;
        float f1=2;//int ---float 自动类型转换
        float f2=314E2F;//314*10(2).0
        System.out.println(f2);
        String s2="你好"+1.2;
    }
}
