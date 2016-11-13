/**
 * Created by Administrator on 2016/11/13.
 */
public class A1 extends A10{
    @Override//注解
    public void go(){//public protected default private

    }

    @Override
    public String toString() {
        return "A::::AA:::A";
    }

    public static void main(String[] args) {
        A1 a=new A1();
        System.out.println(a.toString());
        System.out.println(a);
    }
}
class A10{
    void go(){//default

    }
}
