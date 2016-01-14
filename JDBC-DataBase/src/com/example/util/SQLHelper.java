package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * �������ݿ���ʵĹ�ͬ��
 * @author Aww
 *
 */
public class SQLHelper {
	
	/* ���ݿ����Ӷ��� */
	private static Connection conn = null;
	
	/* ˽�й��캯������ֹ���౻new��  */
	private SQLHelper(){}
	
	/* ��̬����飬����������ݿ������ */
	static {
		if( conn == null ){
			//���ݿ�û�����ӵ����
			try{
				//�����ݿ�����
				Class.forName("co.mysql.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3306/test";
				conn = DriverManager.getConnection(url,"root","123456");
			}catch( ClassNotFoundException err ){
				System.out.println("�����쳣");
				err.printStackTrace();
			}catch( SQLException err ){
				System.out.println("SQL�����쳣");
				err.printStackTrace();
			}
		}
	}
	
	/**
	 * �ڳ���ԱҪ��ʱ������������ݿ������
	 * @return ���ݿ�����
	 */
	public static Connection getConn(){
		return conn;
	}
	
	/**
	 * ����������һ��SQL��������
	 * @return 
	 */
	public static Statement getStatement() 
			throws SQLException{
		return conn.createStatement();
	}
	
	/**
	 * ����������һ�����ε�SQL����
	 * @param sql  SQL����
	 * @return
	 * @throws SQLException
	 */
	public static PreparedStatement getPStatement(
			String sql) throws SQLException {
		return conn.prepareStatement( sql );
	}
	
	/**
	 * �޸����ݿⷽ����insert/update/delete��
	 * @param sql SQL����
	 * @param paras ��̬������ֵ
	 * @return	������true �޸��£�false
	 * @throws SQLException	SQLException
	 */
	public static boolean modify(
			String sql,Object[] paras )
			throws SQLException{
		/* ���ɶ�̬SQL����  */
		PreparedStatement ps = getPStatement( sql );
		/* ���ö�̬����ֵ */
		if(paras != null){
			int index = 1;
			for( Object obj : paras ){
				ps.setObject(index, obj);		//�൱�ڸ�����ֵ
				index += 1;
			}
		}
		/* ��������  */
		int rtn = ps.executeUpdate();
		/* ����  */
		return rtn > 0 ? true : false ;
	}
	
	public static boolean modify( 
			String sql ) throws SQLException {
		return modify( sql , null );
	}

	/**
	 * ���ݵ���������
	 * @param sql SQL���
	 * @param paras ����SQL�Ĳ���
	 * @return
	 * @throws SQLException
	 */
	public static boolean modifyAll( 
			String [] sql, List<Object []> paras )
			throws SQLException {
		/* SQL�������һ���Լ��*/
		if( paras != null && sql.length != paras.size() ){
			throw new SQLException(
					"SQL���������ĸ�����һ��");
		}

		try{
			/* ������*/
			conn.setAutoCommit( true );
			
			/*ѭ��ִ��ÿһ��SQL*/
			for( int i = 0; i < sql.length; i++ ){
				modify( sql[i],paras.get( i ));//ȡ��SQL����е�ÿһ��sql�����Լ���Ӧ�Ĳ���
			}
			/*�ύ����*/
			conn.commit();
			return true;
		}catch( SQLException err ){
			/*����ʱ���ع�����*/
			conn.rollback();
			/*�ٴ��׳�����*/
			throw err;
		}
	}
	
	/**
	 * ���ݼ�������
	 * @param sql SQL����
	 * @param paras	��̬����
	 * @return	����������������
	 * 			�쳣��null
	 * @throws SQLException
	 */
	public static ResultSet find( 
			String sql, Object [] paras )
			throws SQLException {
		/*ȡ��SQl����*/
		PreparedStatement ps = getPStatement( sql );
		
		/* ���ö�̬����*/
		if( paras != null ){
			int index = 1;
			for( Object obj : paras ){
				ps.setObject( index, obj );
				index += 1;
			}
		}
		
		/*ִ��SQL������*/
		ResultSet rs = ps.executeQuery();
		return rs;
	}
	
	public static ResultSet find( String sql )
			throws SQLException {
		return find( sql, null );
	}
}