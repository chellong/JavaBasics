package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * 用于数据库访问的共同类
 *
 */
public class SQLHelper {
	
	/* 数据库连接对象 */
	private static Connection conn = null;
	
	/* 私有构造函数，防止本类被new出  */
	private SQLHelper(){}
	
	/* 静态构造块，用于完成数据库的连接 */
	static {
		if( conn == null ){
			//数据库没有连接的情况
			try{
				//打开数据库连接
				Class.forName("co.mysql.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3306/test";
				conn = DriverManager.getConnection(url,"root","123456");
			}catch( ClassNotFoundException err ){
				System.out.println("驱动异常");
				err.printStackTrace();
			}catch( SQLException err ){
				System.out.println("SQL操作异常");
				err.printStackTrace();
			}
		}
	}
	
	/**
	 * 在程序员要求时，返回这个数据库的连接
	 * @return 数据库连接
	 */
	public static Connection getConn(){
		return conn;
	}
	
	/**
	 * 创建并返回一个SQL操作对象
	 * @return 
	 */
	public static Statement getStatement() 
			throws SQLException{
		return conn.createStatement();
	}
	
	/**
	 * 创建并返回一个带参的SQL对象
	 * @param sql  SQL命令
	 * @return
	 * @throws SQLException
	 */
	public static PreparedStatement getPStatement(
			String sql) throws SQLException {
		return conn.prepareStatement( sql );
	}
	
	/**
	 * 修改数据库方法（insert/update/delete）
	 * @param sql SQL命令
	 * @param paras 动态参数的值
	 * @return	正常：true 无更新：false
	 * @throws SQLException	SQLException
	 */
	public static boolean modify(
			String sql,Object[] paras )
			throws SQLException{
		/* 生成动态SQL对象  */
		PreparedStatement ps = getPStatement( sql );
		/* 设置动态参数值 */
		if(paras != null){
			int index = 1;
			for( Object obj : paras ){
				ps.setObject(index, obj);		//相当于给？赋值
				index += 1;
			}
		}
		/* 更新数据  */
		int rtn = ps.executeUpdate();
		/* 返回  */
		return rtn > 0 ? true : false ;
	}
	
	public static boolean modify( 
			String sql ) throws SQLException {
		return modify( sql , null );
	}

	/**
	 * 数据的批量更新
	 * @param sql SQL命令集
	 * @param paras 多条SQL的参数
	 * @return
	 * @throws SQLException
	 */
	public static boolean modifyAll( 
			String [] sql, List<Object []> paras )
			throws SQLException {
		/* SQL与参数的一致性检查*/
		if( paras != null && sql.length != paras.size() ){
			throw new SQLException(
					"SQL语句与参数的个数不一致");
		}

		try{
			/* 打开事务*/
			conn.setAutoCommit( true );
			
			/*循环执行每一条SQL*/
			for( int i = 0; i < sql.length; i++ ){
				modify( sql[i],paras.get( i ));//取出SQL命令集中的每一条sql命令以及对应的参数
			}
			/*提交事务*/
			conn.commit();
			return true;
		}catch( SQLException err ){
			/*出错时，回滚事务*/
			conn.rollback();
			/*再次抛出错误*/
			throw err;
		}
	}
	
	/**
	 * 数据检索处理
	 * @param sql SQL命令
	 * @param paras	动态参数
	 * @return	正常：检索参数集
	 * 			异常：null
	 * @throws SQLException
	 */
	public static ResultSet find( 
			String sql, Object [] paras )
			throws SQLException {
		/*取得SQl对象*/
		PreparedStatement ps = getPStatement( sql );
		
		/* 设置动态参数*/
		if( paras != null ){
			int index = 1;
			for( Object obj : paras ){
				ps.setObject( index, obj );
				index += 1;
			}
		}
		
		/*执行SQL并返回*/
		ResultSet rs = ps.executeQuery();
		return rs;
	}
	
	public static ResultSet find( String sql )
			throws SQLException {
		return find( sql, null );
	}
}
