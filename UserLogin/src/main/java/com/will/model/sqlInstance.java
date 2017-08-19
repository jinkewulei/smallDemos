package com.will.model;

import java.sql.Connection;

/**
 * Created by william on 16/7/19.
 */
public class sqlInstance {
    public static boolean isValidUser(String inPutname, String inputPassword) {
        sqlHelp jdbcQuery = new sqlHelp();
        Connection conn = sqlHelp.getMysqlConnection();

//        String name = "sunny";
        String sqlString = "select * from will.employee where age<30;";
        String sqlResultString = "select password from will.userAccount where name = '" + inPutname + "';";
        //jdbcQuery.getTheResultOfSqlQuery(conn,sqlString);

        String realPassword = sqlHelp.returnTheUniqueStringOfQuery(conn, sqlResultString);
        System.out.println(realPassword + "000");

        sqlHelp.closeConn(conn);
        System.out.println("JDBC end, Bye!");

        if (inputPassword.equals(realPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
