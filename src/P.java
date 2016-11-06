/**
 * Created by Administrator on 2016/11/6.
 */
public class P {
    public static void main(String[] args) {
//        int [][] a={{1,2,3,4,5}};
//        a[0]=new int[1];
//        a[1]=new int[1];
//        a[2]=new int[3];

        matrixMulti();
    }


    static void matrixMulti(){
        int [][]a={
                    {1,2},
                    {3,4},
                    {5,6}
                   };
        int [][]b={
                    {1,2,3},
                    {4,5,6}
                   };
        /*
               1*1+2*4,1*2+2*5,1*3+2*6
               43,50

         */
        int [][]c=new int[a.length][b[0].length];


        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                int tmp=0;
                for(int k=0;k<b.length;k++){
                    tmp+=a[i][k]*b[k][j];
                }
                c[i][j]=tmp;
            }

        }


        for( int [] i :c){
            for( int j :i){
                System.out.println(j);

            }

        }

    }
    static void matrixAdd(){
        int [][]a={{1,2},{3,4}};
        int [][]b={{5,6},{7,8}};

        int [][]c=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }

        }
        for( int [] i :c){
            for( int j :i){

                System.out.print(j);
            }
            System.out.println();
        }


    }

}
