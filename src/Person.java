/**
 * Created by Administrator on 2016/11/13.
 */
public class Person {
    Brain brain;

    public Person(){//组合 Composite
        brain=new Brain();
    }


    public static void main(String[] args) {
        Person p=new Person();
    }

}
class Brain{

}
