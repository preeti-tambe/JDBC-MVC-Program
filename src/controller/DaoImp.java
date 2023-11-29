package controller;

import java.sql.SQLException;

import model.Employee;

public interface DaoImp {

	int save(Employee e) throws ClassNotFoundException, SQLException;
	int delete(int roll);
	int update();
	void show();
	
	
}
