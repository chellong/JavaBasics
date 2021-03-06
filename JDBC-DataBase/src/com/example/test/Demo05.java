package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo05 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/test","root","3529");
			
			conn.setAutoCommit(false); 
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
			
			for(int i=0;i<20000;i++){
				stmt.addBatch("insert into t_user (username,pwd,regTime) values ('"+i+"',666666,now())");
			}
			stmt.executeBatch();
			conn.commit();  
			long end = System.currentTimeMillis();
			System.out.println("执行两万条数据耗时"+(end-start));
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(rs!=null){
				
					rs.close();
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			try {
				
				if(stmt!=null){
				
					stmt.close();
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
