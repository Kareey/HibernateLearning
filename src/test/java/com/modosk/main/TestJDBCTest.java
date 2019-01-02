package com.modosk.main;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestJDBCTest {
    final String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useLegacyDatetimeCode=false&serverTimezone=Europe/Amsterdam&useSSL=false";
    final String user = "kareey";
    final String password = "CyberPunk2077";
    private static  TestJDBC test;
    @org.junit.Before
    public void setUp() throws Exception {
      test  = mock(TestJDBC.class);

    }

    @org.junit.Test
    public void testConnection_with_valid_credentials() {
        when(test.connectDB(jdbcURL,user,password)).thenReturn(true);
    }
    @Test
    public void testConnection_with_wrong_credentials(){
        when(test.connectDB("asdasdas","asd","asd")).thenReturn(false);
    }
    @Test
    public void testConnection_with_null_credentials(){
        when(test.connectDB(null,null,null)).thenReturn(false);
    }
}