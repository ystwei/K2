/**
 * Created by Administrator on 2016/11/5.
 */
public class O {
    public static void main(String[] args) {

//        int[][] a={{1,2,3,4,5,6},{6,7,8}};
//
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//        }
//
//        for(int [] i :a){
//            for( int j :i){
//                System.out.println(j);
//            }
//        }


        int [][][]a={{{1,2,3,4,5},{6,7,8}},{{11,12,15},{10,12}},{{9}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);

                }

            }

        }

        for(int [][] i : a ){
            for(int [] j :i ){
                for(int k :j ){
                    System.out.println(k);
                }

            }

        }

    }

}
