/**
 * Created by Administrator on 2016/11/13.
 */
public class Z  extends Z0{
    Z(){
        this(100);
        System.out.print("5");
    }
    Z(int old){

        super(100);
        System.out.print("4");
    }
    Z(String name){
        this();
        System.out.print("3");
    }
    Z(int old ,String name){
        System.out.print("2");
    }
    public static void main(String[] args) {
        new Z(100);//124
    }
    {//
        System.out.print("1");
    }

}
class Z0{
    {
        System.out.print("7");
    }
    Z0(){
        System.out.print("6");
    }
    Z0(int age){
        System.out.print("8");
    }
}
