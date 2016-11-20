package com.weikun.C;

/**
 * Created by Administrator on 2016/11/20.
 */
public class E {
    public static void main(String[] args) {
//        E e=new E();
//        e.mark(new IE(){
//            @Override
//            public void go() {
//                System.out.println("ok");
//            }
//        },"北京");


//        E e1=new E();
//        e1.plan().go();


          new IE(){
              @Override
              public void go() {
                  System.out.println("000");
              }
          }.go();


    }
    IE plan(){
        return new IE(){
            @Override
            public void go() {
                System.out.println("ok222");
            }
        };
    }
    void mark(IE i,String name){
        i.go();
    }
}
interface IF{
    void go();
}
interface IE{
    void go();
}
