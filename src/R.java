/**
 * Created by Administrator on 2016/11/6.
 */
public class R {
    public static void main(String[] args) {
        int a[]={0,1,9,7,6,3,10,11,2};
        quick(a,0,a.length-1);
        for( int i:a){
            System.out.println(i);
        }
    }
    static void quick(int a[],int start,int end){
        int i=start;
        int j=end;
        if(i>=j){
            return;
        }
        boolean flag=true;//false:cursor从左到右，true：从右到左
        while(i!=j){//第一次的临界值排序完毕
            if(a[i]-a[j]>0){//发现大的就交换
                int tmp=0;
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                flag=!flag;//交换游标的方向
            }
            if(flag){
                j--;
            }else{
                i++;
            }
        }
        i--;
        j++;
        quick(a,start,i);//临界值左段
        quick(a,j,end);//临界值右段
    }
}
