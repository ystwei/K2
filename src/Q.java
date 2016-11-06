/**
 * Created by Administrator on 2016/11/6.
 */
public class Q {
    public static void main(String[] args) {
        int[] a={5,1,6,8,9,2};//O(n2)
        for(int i=0;i<a.length-1;i++){//-1:最后一次已经走过了，就不用在执行一次了
            for(int j=0;j<a.length-1-i;j++){//-1:防止取数越界
                // -i:每次经历循环之后，最大的那个数，在最后，就不用在排了。
                int tmp=0;
                if(a[j]-a[j+1]>0){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }

            }

        }


        for(int i :a){
            System.out.println(i);
        }
    }
}
