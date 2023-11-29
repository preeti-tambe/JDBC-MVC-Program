package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employee;

public class EmployeeDao implements DaoImp{
	
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/company";
	private String upass="abc123";
	private String uname="root";
	
	Connection getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url, uname, upass);
		return con;
		
	}

	@Override
	public int save(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		String q="insert into emp (name,city) values(?,?)";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, e.getName());
		ps.setString(2, e.getAdd());
		
		
			return ps.executeUpdate();
	}

	@Override
	public int delete(int roll) {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		Statement st=con.createStatement();
		String q="delete from emp where id="+id;
		
		return st.executeUpdate(q);
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
