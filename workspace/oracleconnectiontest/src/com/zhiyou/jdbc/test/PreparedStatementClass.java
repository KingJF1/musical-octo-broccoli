package com.zhiyou.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementClass {
	public PreparedStatementClass(String name,long sal) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		String sql = "select * from employees where emp_name=? and salary>?";
		try {
			connection = JDBCDdl.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setLong(2, sal);
			result = statement.executeQuery();
			while (result.next()) {
				System.out.println(result.getString(1));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public PreparedStatementClass() {
		// TODO Auto-generated constructor stub
	}
	public void insertEmployeesByBat() {
		try {
			Connection connection = JDBCDdl.getConnection();
			String sql = "insert into employees(emp_code,emp_name,salary) "
					+ "values(seq_employees.nextval,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < 5; i++) {
				preparedStatement.setString(1, "批量插入"+i);
				preparedStatement.setDouble(2, 8000);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void executeByTransaction() {
		try {
			Connection connection = JDBCDdl.getConnection();
			String sql = "update employees set salary=6000 where salary<6000";
			String sql1 = "update employees set salary=3000 where salary is null";
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			try {
				int r1 = statement.executeUpdate(sql);
				System.out.println("第一条更新影响了" + r1 + "行");
				int r2 = statement.executeUpdate(sql1);
				System.out.println("第二条更新影响了" + r2 + "行");
				connection.commit();
			} catch (Exception e) {
				connection.rollback();
				System.out.println("有SQL语句执行失败，事务回滚");
			}
			connection.close();
		} catch (SQLException e) {
			
		}
	}
	public void pageemployees(int pageSize,int curretpage) {
		try {
			Connection connection = JDBCDdl.getConnection();
			Statement statement = connection.createStatement();
			String sql1 = "select count(1) from employees";
			ResultSet resultSet = statement.executeQuery(sql1);
			resultSet.next();
			int sum = resultSet.getInt(1);
			String sql2 = "select * from employees";
			ResultSet resultSet2 = statement.executeQuery(sql2);
			System.out.println("-------第"+ curretpage + "页---------");
			for (int j = 0; j < sum/pageSize+1; j++) {
				for (int i = 0; i < pageSize; i++) {
					if (resultSet2.next()&&(j==curretpage-1)) {
						System.out.println(resultSet2.getLong("emp_code")+"----"
								+ resultSet2.getString("emp_name")+"----"
										+ resultSet2.getString("status")+"----"
												+ resultSet2.getDouble("salary"));
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PreparedStatementClass preparedStatement = new PreparedStatementClass();
		preparedStatement.pageemployees(5,1);
	}
}
