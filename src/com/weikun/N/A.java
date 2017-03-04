package com.weikun.N;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/3/4.
 */
public class A {
    @Test
    public void add(){
        Connection conn=null;
        PreparedStatement pstmt=null;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");

            conn=DriverManager.
                    getConnection("jdbc:mysql://127.0.0.1/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql="insert into a(v_name,v_sex,v_salary) values(?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"����");
            pstmt.setString(2,"Ů");
            pstmt.setFloat(3,100.1f);

            System.out.println(pstmt.executeUpdate());




        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {

                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
    @Test
    public void queryByCondition(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn=DriverManager.
                    getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql="select * from orderitems where item_price>? ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setFloat(1,10);

            rs=pstmt.executeQuery();


            while(rs.next()){
                System.out.printf("%s--%f\n",rs.getString("prod_id"),rs.getFloat("item_price"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    @Test
    public void queryAll(){
        Connection conn=null;//�����������ݿ�
        PreparedStatement pstmt=null;//ִ��sql���Ķ���
        ResultSet rs=null;//���������������
        //1��������
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2��������
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");

            //3����SQL���ִ�ж���
            String sql="select * from orderitems";
            pstmt=conn.prepareStatement(sql);
            //4ִ��sql��䣬���ұ���
            rs=pstmt.executeQuery();

            while(rs.next()){//rs.next��������

                System.out.printf("%s%f\n",rs.getString("prod_id"),rs.getFloat("item_price"));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {//5�ر�
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
