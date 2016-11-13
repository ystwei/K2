/**
 * Created by Administrator on 2016/11/13.
 */
public class Y extends  Y0{

    public Y(){
        super(100);
    }
    void make(){
        super.go();
    }
    void go(){
        System.out.println("y----go");
    }
    public static void main(String[] args) {
        new Y().make();
    }
}
class Y0 extends Y00{

    void go(){
        super.go();
       // System.out.println("y0----go");
    }
    public Y0(int age){
    }

}
class Y00{
    void go(){
        System.out.println("y00----go");
    }

}
