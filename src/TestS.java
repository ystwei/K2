/**
 * Created by Administrator on 2016/11/12.
 */
public class TestS {
    public static void main(String[] args) {
        Student s=new Student(100);
//        s.setName("MIKE");
//        System.out.print(s.getName());

       // System.out.println(s);
        Student s1=new Student();
        Student s2=s1;//把s1的值送给s2,s1里面存的就是堆的地址，s1==s2,代表一个堆
        System.out.println(s1);
        s.setName("赵");

        System.out.println(s1.getName());

    }
}
class Student {//默认类
    Student(int old){//非默认构造器
       // System.out.print(old);
    }
    Student(){
        //默认构造器}
    }
    String no;
    String name;//out---read---get
    //in----write--set
    //getter setter
    char sex;
    int old;

    String getName(){//getter

        return name;
    }
    void setName(String name1){//setter
        name=name1;

    }
}

