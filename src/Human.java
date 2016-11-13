/**
 * Created by Administrator on 2016/11/13.
 */
public class Human {
    private Computer com;
    Human(){  }
    Human(Computer com1){
        com=com1;
    }
    public void setCom(Computer com1){
        com=com1;
    }
    public static void main(String[] args) {
        Computer c=new Computer();//Aggregation:
       // Human h=new Human(c);
        Human h=new Human();
        h.setCom(c);
    }


}
class Computer{

}