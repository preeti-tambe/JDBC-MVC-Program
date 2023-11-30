package controller;

import java.sql.SQLException;

import model.Employee;

public interface DaoImp {

	int save(Employee e) throws ClassNotFoundException, SQLException;
	int delete(int roll) throws ClassNotFoundException, SQLException;
	int update();
	void show();
	
	
}
