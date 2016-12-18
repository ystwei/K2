import java.util.Arrays;//include C# using

/**
 * Created by Administrator on 2016/11/5.
 */
public class N {
    public static void main(String[] args) {
//        getMax();
//        getAvg();

        //jdkBinary();

        System.out.print(erFen());
    }
    static int erFen(){
        int a[]={9,1,2,5,4,7};
        int key=70;
        Arrays.sort(a);
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            //mid:相对中间的索引号
            int mid=(lo+hi)/2;
            if(key<a[mid]){//
                hi=mid-1;
            }else if(key>a[mid]){
                lo=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static void jdkBinary(){

        int a[]={5,7,1,2,3,4};
        int key=1;
        Arrays.sort(a);

        System.out.println(Arrays.binarySearch(a,6));

    }
    static void jdkCopy1(){
        int a[]={1,2,3,4,5};
        int b[]=Arrays.copyOf(a,10);
        for(int i:b){
            System.out.println(i);

        }
    }
    static void jdkFill(){
        int a[]={1,2,3,4,5};

        Arrays.fill(a,0);
        for(int i:a){
            System.out.println(i);

        }
    }
    static void jdkCopy(){

        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};

        System.arraycopy(a,1 , b,2 , 4);//越界了，
        for(int i:b){
            System.out.println(i);

        }
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
