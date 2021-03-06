package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/test","root","3529");
			
			String sql = "insert into t_user (username,pwd,regTime) values (?,?,?)"; 
		
			ps = conn.prepareStatement(sql);
			ps.setObject(1, "1");
			ps.setObject(2, "2");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			
//			ps.execute();
			
			int count = ps.executeUpdate();
			System.out.println(count);
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null){
					ps.close();
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
