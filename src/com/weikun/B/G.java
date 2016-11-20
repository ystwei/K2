package com.weikun.B;

/**
 * Created by Administrator on 2016/11/20.
 */
public class G {
    public static void main(String[] args) {
        G g=new G();
        g.mark(new G0());
        g.mark(new G1());
    }
    void mark(G00 g1){
        g1.go();
    }

}
class G1 extends G00{
    @Override
    void go() {
        System.out.print(3);
    }
}
class G0 extends G00{
    @Override
    void go() {
        System.out.print(2);
    }
}
class G00{
    void go(){
        System.out.print(1);
    }
}
