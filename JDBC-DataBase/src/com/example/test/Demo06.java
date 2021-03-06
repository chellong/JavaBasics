package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


public class Demo06 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/test","root","3529");
			
			conn.setAutoCommit(false); 
			
			ps1 = conn.prepareStatement("insert into t_user (username,pwd,regTime) values (?,?,?)");
			ps1.setObject(1, "1");
			ps1.setObject(2, "123456");
			ps1.setObject(3,new Date());
			ps1.execute();
			
			System.out.println("ps1");
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ps2 = conn.prepareStatement("insert into t_user (username,pwd,regTime) values (?,?,?)");
			ps2.setObject(1, "1");
			ps2.setObject(2, "123456");
			ps2.setObject(3,new Date());
			ps2.execute();			
			
			System.out.println("ps2");
			
			
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try{
					conn.rollback();	
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps1!=null){
					ps1.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
