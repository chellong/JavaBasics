package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 连接参数 jdbc:mysql://192.168.1.6:3306/test","root","3529"
 * 
 * @author 北飞的候鸟
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			long start = System.currentTimeMillis();
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/test","root","3529");
			long end = System.currentTimeMillis();
			System.out.println(conn);
			System.out.println("共计用时"+(end-start)+"ms");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
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
