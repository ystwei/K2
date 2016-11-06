/**
 * Created by Administrator on 2016/11/6.
 */
public class S {


    public static void main(String[] args) {
        int a[]={4,1};
        int start=0;
        int end=a.length-1;
        quick(a,start,end);//第一次排序

        for(int i:a){
            System.out.println(i);
        }
    }

    /**
     *
     * @param a:待排序数组
     * @param start：分段的开始索引
     * @param end：分段的结束索引
     */
    static void quick(int [] a,int start,int end){
        int i=start;
        int j=end;
        if(i>=j){
            return ;
        }
        //针对临界值的第一次快排
        boolean flag=true;//false:左到右 true:右到左
        while(i!=j){
            if(a[i]-a[j]>0){
                int tmp=0;
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;

                flag=!flag;

            }

            if(flag){
                j--;
            }else{
                i++;
            }

        }
        i--;
        j++;
        quick(a,start,i);

        quick(a,j,end);
    }
}
