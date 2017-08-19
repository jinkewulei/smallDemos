package com.will.model;

import java.sql.*;

/**
 * Created by william on 16/7/19.
 */
public class sqlHelp {
    public static Connection getMysqlConnection( ) {
//        System.out.println("jdbc conn");

        String url = "jdbc:mysql://localhost:3306/will";
        String username = "root";
        String password = "root";

        try {
            //1.加载驱动
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //2.获取与数据库的链接
            Connection connection = DriverManager.getConnection(url, username, password);
            //connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, username, password);
            //Class.forName("com.mysql.jdbc.Driver");

            return connection;
        } catch (SQLException ex) {
            System.out.println("Can't get any connection!");
            return null;
        }
    }

    public static void getTheResultOfSqlQuery(Connection conn, String sqlStr) {
        try {
            //3.获取用于向数据库发送sql语句的statement对象
            Statement st = conn.createStatement();

            //4.向数据库发送sql语句，并获取代表结果集的ResultSet对象
            ResultSet result = st.executeQuery(sqlStr);

            //5.取出结果集的数据
            while (result.next()) {
                System.out.print("id= " + result.getObject("id") + " ");
                System.out.println("name= " + result.getObject("name"));
            }

            //6.关闭链接，释放资源
            result.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println("Sql Query Failed!");
        }
    }

    public static String returnTheUniqueStringOfQuery (Connection conn, String sqlStr) {
        String password = new String();
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sqlStr);

            if (result.next()) {
                password = (String) result.getObject("password");
//                System.out.print(password);
            }

            result.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println("Query for the password Failed!");
        }

        return password;
    }

    public static void closeConn(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Close Connection failed!!!");
        }
    }
}
