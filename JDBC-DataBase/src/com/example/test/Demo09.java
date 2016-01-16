package com.example.test;

import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo09 {
	
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Reader r  = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			
			ps = conn.prepareStatement("select * from t_user where id=?");
			ps.setObject(1, 101024);
			
			rs = ps.executeQuery();
			while(rs.next()){
				Clob c = rs.getClob("myInfo");
				r  = c.getCharacterStream();
				int temp = 0;
				while((temp=r.read())!=-1){
					System.out.print((char)temp);
				}
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(r!=null){
					r.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
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
