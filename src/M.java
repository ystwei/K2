/**
 * Created by Administrator on 2016/11/5.
 */
public class M {
    void ok(){
        old=200;
    }
    static int old=200;
    public static void main(String[] args) {
        int p=100;//static--->dynamic
        String s="���";
        int [] a=new int[10];//float 0.0 char=/u0000 boolean =false
        int [] a1={0,1,2,3,4,5};//ֻ��������Ԫ�ص����
        int [] a2=new int[]{1,2,3,4,5,6,7,8,9,0};
//        for(int i=0;i<a2.length;i++){//�����������
//            a2[i]=0;
//        }
        System.out.println("����������".length());
        for(int t   :a2 ){//��ֵ�����ԣ�����readonly
            t=0;
        }
        for(int i=0;i<a.length;i++){

            System.out.println(a2[i]);
        }

    }
}
