package com.weikun.D;

import java.util.Calendar;

/**
 * Created by Administrator on 2016/11/26.
 */
public class E {
    public static void main(String[] args) {
        double d = -345.671;
        String s = "��ã�";
        int i = 16;
        //"%"��ʾ���и�ʽ�������"%"֮�������Ϊ��ʽ�Ķ��塣
        System.out.printf("%f",d); //"f"��ʾ��ʽ�������������
        System.out.println();
        System.out.printf("%9.2f",d); //"9.2"�е�9��ʾ����ĳ��ȣ�2��ʾС������λ����
        System.out.printf("%+9.2f",d); //"+"��ʾ��������������š�
        System.out.println();
        System.out.printf("%-9.4f",d);
        System.out.println();
        System.out.printf("%+-9.3f",d);
        System.out.println();
        System.out.printf("%d",i); //"d"��ʾ���ʮ����������
        System.out.println();
        System.out.printf("%o",i); //"o"��ʾ����˽���������
        System.out.println();
        System.out.printf("%x",i); //"d"��ʾ���ʮ������������
        System.out.println();
        System.out.printf("%#x",i); //"d"��ʾ�������ʮ�����Ʊ�־��������
        System.out.println();
        System.out.printf("%s",s); //"d"��ʾ����ַ�����
        System.out.println();

        System.out.printf("���һ����������%f��һ��������%d��һ���ַ�����%s",d,i,s);
        System.out.println();

        System.out.printf("�ַ�����%2$s��%1$d��ʮ����������%1$#x",i,s);
        System.out.println();
        System.out.printf("%14.3s",s);
        Calendar c= Calendar.getInstance();


    }
}
