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
            pstmt.setString(1,"深圳");
            pstmt.setString(2,"女");
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
        Connection conn=null;//用来连接数据库
        PreparedStatement pstmt=null;//执行sql语句的对象
        ResultSet rs=null;//结果集，用来遍历
        //1加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2建立连接
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");

            //3创建SQL语句执行对象
            String sql="select * from orderitems";
            pstmt=conn.prepareStatement(sql);
            //4执行sql语句，并且遍历
            rs=pstmt.executeQuery();

            while(rs.next()){//rs.next遍历开关

                System.out.printf("%s%f\n",rs.getString("prod_id"),rs.getFloat("item_price"));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {//5关闭
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
