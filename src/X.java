/**
 * Created by Administrator on 2016/11/13.
 */
public class X {
    int i=0;
    X go(){
        i++;
        return this;
    }

    public static void main(String[] args) {
        X x=new X();
        x.go().go().go().go();
        System.out.print(x.i);
    }
}
