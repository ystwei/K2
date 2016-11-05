/**
 * Created by Administrator on 2016/11/5.
 */
public class N {
    public static void main(String[] args) {
//        getMax();
//        getAvg();

        reverseArry();
    }
    static void getMax(){
        int a[]={4,1,2,3,5};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-max>0){
                max=a[i];
            }
        }
        System.out.print(max);
    }

    static void getAvg(){//average
        int a[]={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];

        }
        System.out.print("平均数是："+sum/a.length);

    }
    static void copyAry(){
        int a[]={1,2,3,4,5,6};
        int []b=new int[a.length];
        int k=0;
        for(int i:a){
            b[k++]=i;
        }

        for(int i :b){

            System.out.println(i);

        }
    }
    static void reverseArry(){

        int []a={1,2,3,4,5,6};
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int tmp=0;
            tmp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=tmp;

        }
        for(int i:a){
         System.out.println(i);

        }
    }
}
