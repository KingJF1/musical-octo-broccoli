package com.zhiyou.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDdl {
	public final static String URL = "jdbc:oracle:thin:@192.168.21.218:1521:orcl";
	public final static String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public final static String USERNAME = "JJF";
	public final static String PASSWORD = "jIN13462967465";
	static {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	public void createTableTest() {
		Connection con = null;
		try {
			con = getConnection();
			String sql = "create table java_test1(name varchar2(10))";
			Statement statement = con.createStatement();
			statement.execute(sql);
				System.out.println("表创建成功");
		} catch (SQLException e) {
			System.out.println("表创建失败");
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void updateTest() {
		try {
			Connection connection = getConnection();
			Statement stat = connection.createStatement();
			String sql = "update employees set salary=salary+1000 where emp_code=1000";
			int a = stat.executeUpdate(sql);
			System.out.println("更新成功了" + a + "条记录！！");
		} catch (SQLException e) {
			System.out.println("更新失败！！");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBCDdl jdbcdl = new JDBCDdl();
			jdbcdl.updateTest();
	}
}
