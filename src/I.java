/**
 * Created by Administrator on 2016/10/29.
 */
public class I {
    static void half(int m){//int????????????????????????????
        m=m/2;
        System.out.println(m);
    }
    static void ok1(){

        //20 40 60
        int old=45;
        if( (old>20)&&(old<40)  ){//?????

            System.out.print("??????");
        }else if((old>40)&&(old<60)){

            System.out.print("??????");
        }
    }


    static void ok2(){
        int  age=45;
        if(age>60){


        }else if(age>40){


        }else if(age>20){


        }else{


        }
    }
    static void ok(){//????
        int i=200;
        if(i==100){//???i????100

           System.out.print("ok");
        }else{
            System.out.print("error");

        }
    }

    public static void main(String[] args) {
//        int m=10;
//        half(m);
//        System.out.println(m);
        ok1();
    }
}
