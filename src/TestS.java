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
        Student s2=s1;//��s1��ֵ�͸�s2,s1�����ľ��Ƕѵĵ�ַ��s1==s2,����һ����
        System.out.println(s1);
        s.setName("��");

        System.out.println(s1.getName());

    }
}
class Student {//Ĭ����
    Student(int old){//��Ĭ�Ϲ�����
       // System.out.print(old);
    }
    Student(){
        //Ĭ�Ϲ�����}
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

