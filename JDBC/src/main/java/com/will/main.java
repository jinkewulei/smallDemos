package com.will;

import com.will.JDBCHelp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Created by william on 16/7/14.
 */
public class main {
    public static void main(String[] args){
        System.out.println("JDBC start.");
        //JDBCHelp.outStream();

        JDBCHelp jdbcQuery = new JDBCHelp();
        Connection conn = JDBCHelp.getMysqlConnection();

        String name = "sunny";
        String sqlString = "select * from will.employee where age<30;";
        String sqlResultString = "select password from will.userAccount where name = '" + name + "';";
        //jdbcQuery.getTheResultOfSqlQuery(conn,sqlString);

        String password = JDBCHelp.returnTheUniqueStringOfQuery(conn, sqlResultString);
        System.out.println(password + "000");

        JDBCHelp.closeConn(conn);


        System.out.println("JDBC end, Bye!");
    }
}
