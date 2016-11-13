/**
 * Created by Administrator on 2016/11/13.
 */
public class V {
    void go(int age,String name){

    }
    void go(int old){

    }

    void go(String name,int age){

    }
    public V(){

        System.out.print(1);
    }

    public V(int age){

    }
    public V(String name){
        this();
        System.out.print(2);
    }

    public static void main(String[] args) {
        V v=new V("");
    }



}
