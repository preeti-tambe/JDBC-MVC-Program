package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.EmployeeDao;
import model.Employee;

public class MenuView {

	public MenuView()throws ClassNotFoundException, SQLException
	{
		int id,a;
		String name,add;
		Scanner sc=new Scanner (System.in);
		boolean l=true;
		while(l)
		{
			System.out.println("\nWELCOME TO COLLEGE MANAGEMENT SYSTEM");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Show");
			System.out.println("0.EXIT");
			System.out.println("Enter Your Choice : ");
			int c = Integer.parseInt(sc.nextLine());
			
			EmployeeDao db=new EmployeeDao();
			
			switch(c)
			{
			case 1:
				System.out.println("Enter Name : ");
				name=sc.nextLine();
				System.out.println("Enter city : ");
				add=sc.nextLine();
				
				Employee e1 = new Employee(name,add);
				
				a=db.save(e1);
				
				if(a>0)
					System.out.println("data inserted");
				else
					
					System.out.println("not inserted");
				
				
				break;
			case 3:
				System.out.println("Enter Roll : ");
				id=Integer.parseInt(sc.nextLine());
				
				a=db.delete(id);
				
				if(a>0)
					System.out.println("data deleted");
				else
					
					System.out.println("not deleted");
				
				break;
				
			}
			
		}
		
	}
}
