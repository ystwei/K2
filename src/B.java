/**
 * Created by Administrator on 2016/10/22.
 */
public class B {

    public static void main(String[] args) {
        char a='A';//0---65535====int[0---65535]
        char b='��';//0---65535 unicode-- GB2312 GBK GB18030 UTF-8
        String c="A1";
        int b1='\r';//0:48 9 A:65 Z:90 a: 97 z:122  \n:10 \b:8 \t:9 \r:13
        System.out.println(b1);
        char c4='\u000C';//unicode ��16����Ϊ0001���Ǹ��ַ�
        System.out.println(c4);
//        String s1="";
//        System.out.println(-2/-0.0);//�Զ����� infinity
//        System.out.println("�Ұ�����\r��");//
//        byte b2=100;//-128--127

    }
}
