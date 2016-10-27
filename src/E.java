/**
 * Created by Administrator on 2016/10/27.
 */
public class E {
    public static void main(String[] args) {

        int a=10;
        int b=6;
        System.out.println(a>5||b++>9);//短路或，当左面为true，右面不算。
        System.out.println(b);
        System.out.println(a>5|b++>9);//按位或，每一位都运算
        System.out.println(b);
        int c=10;
        int d=6;
        System.out.println(c>7&&d++>9);//短路与，当左面为false，右面不算。
        System.out.println(d);
        System.out.println(c>5&d++>9);//按位与，每一位都运算
        System.out.println(d);
    }
}
