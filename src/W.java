/**
 * Created by Administrator on 2016/11/13.
 */
public class W  extends W1{
    W(int i){
        super(10);
        System.out.println("W");

    }

    public static void main(String[] args) {
        new W(10);//匿名对象
    }
}
class W1 extends W0{
    W1(int age){
        super(10);
        System.out.println("W1--age");
    }
    W1(){
        System.out.println("W1");
    }

}
class W0 extends Object{
    W0(){
        System.out.println("W0");
    }
    W0(int age){
        System.out.println("W0---age");
    }
}