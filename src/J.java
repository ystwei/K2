/**
 * Created by Administrator on 2016/10/29.
 */
public class J {
    public static void main(String[] args) {
        ok();
    }

    static void ok(){
        int month=2;
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.print("围炉赏雪");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("春暖花开");
                break;
            default:
                System.out.print("错误");


        }
    }
}
