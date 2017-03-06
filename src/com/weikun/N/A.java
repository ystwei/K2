package com.weikun.N;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/3/4.
 */
public class A {


    @Test
    public void testFun(){
        Connection conn=null;
        CallableStatement cs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql=" {?=call f_2(?)}";
            cs=conn.prepareCall(sql);
            cs.registerOutParameter(1, Types.INTEGER);//ע�����������������
            cs.setFloat(2,10f);//�����������ֵ
            cs.execute();
            System.out.println(cs.getObject(1));//�����ķ���


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {


                if(cs!=null){
                    cs.close();
                }
                if(conn!=null){
                    conn.close();

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void testPro(){
        Connection conn=null;
        CallableStatement cs=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql=" call p_6(?,?)";
            cs=conn.prepareCall(sql);
            cs.setFloat(1,10f);//�����������ֵ
            cs.registerOutParameter(2, Types.INTEGER);//ע�����������������
            boolean flag=cs.execute();
            System.out.println(cs.getObject(2));//out_count,�������
            while(flag){
                rs=cs.getResultSet();
                while(rs.next()){
                    System.out.printf("%s---%f\n",rs.getString("prod_id"),rs.getFloat("item_price"));
                }
                flag=cs.getMoreResults();//�Ƿ��и���Ľ����
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null){
                    rs.close();
                }

                if(cs!=null){
                    cs.close();
                }
                if(conn!=null){
                    conn.close();

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void update(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql="update  a set v_name=? where id=?";
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"������");
            pstmt.setInt(2,3);
            System.out.println(pstmt.executeUpdate()>0?"�ɹ�":"ʧ��");

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void del(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
             //1.��������
            Class.forName("com.mysql.jdbc.Driver");
            //2��������
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql="delete  from a where id in(20,21,22,23)";
            pstmt=conn.prepareStatement(sql);


            System.out.println(pstmt.executeUpdate()>0?"�ɹ�":"ʧ��");

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt!=null){
                    pstmt.close();

                }
                if(conn!=null){
                    conn.close();

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }




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
