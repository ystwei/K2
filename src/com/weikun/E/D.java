package com.weikun.E;

/**
 * Created by Administrator on 2016/11/27.
 */
public class D {
    public static void main(String[] args) {
        new D().go();
    }
    public void go(){
        int age=14;
        if(age<18){
            try {
                throw new D1(14);
            } catch (D1 d1) {
                System.out.print(d1);
            }
        }else if(age>80){
            try {
                throw new D2();
            } catch (D2 d2) {
                System.out.print(d2);
            }

        }else{
            System.out.print("����Կ��ҵ���վ");
        }
    }
}
class D1 extends Exception{
    private int age;
    D1(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return this.age+":��̫С��";
    }
}

class D2 extends Exception{
    @Override
    public String toString() {
        return "��̫���ˣ�";
    }

}