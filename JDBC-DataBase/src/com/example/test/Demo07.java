package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Random;


public class Demo07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/test","root","3529");
			
			for(int i=0;i<1000;i++){
				
				ps = conn.prepareStatement("insert into t_user (username,pwd,regTime,lastLoginTime) values (?,?,?,?)");
				ps.setObject(1, "1"+i);
				ps.setObject(2, "123456");

				int rand =  100000000+new Random().nextInt(1000000000);
				
				java.sql.Date date = new java.sql.Date(System.currentTimeMillis()-rand);
				Timestamp stamp = new Timestamp(System.currentTimeMillis()-rand); 
				
				ps.setDate(3, date);
				ps.setTimestamp(4, stamp);
				ps.execute();
				
				
			}
			
			
			
			System.out.println("");
			
			
			
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
