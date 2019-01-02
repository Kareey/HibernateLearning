package com.modosk.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useLegacyDatetimeCode=false&serverTimezone=Europe/Amsterdam&useSSL=false&allowPublicKeyRetrieval=true";
        String user = "kareey";
        String password = "Hullamos1077";
        TestJDBC test = new TestJDBC();
        System.out.println(test.connectDB(jdbcURL,user,password));

    }

    public boolean connectDB(final String jdbcURL, final String user, final String password) {
        try {
            Connection con = DriverManager.getConnection(jdbcURL, user, password);
            return con != null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
