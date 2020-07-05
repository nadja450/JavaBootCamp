package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {


	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
	
	}

	public void testFindEmployeeById_MatchFound() {
		//complete the code here
		Employee e1=new Employee();
		e1=emp.findEmployeeById("3");
		
		assertNotNull (e1);
				 	
    }
         	
	   
	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		Employee ee = emp.findEmployeeById("99");
		assertNull (ee);
	
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		
		ArrayList<Employee> e1= emp.findEmployeesByName("Vera");
		
		
		assertNotNull (e1);
		
		
				
			//complete the code here
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> e1=emp.findEmployeesByName("Vasiljeva");
		//Employee ee = emp.findEmployeesByName("Sidorov");
		assertNull(e1);
		
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
		ArrayList<Employee> e1= emp.findEmployeesBySalary(3000);
		assertNotNull (e1);
				
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> e1= emp.findEmployeesBySalary(1000);
		assertNull (e1);
		

	}
	
    public void testInsertEmployee(){
       Employee e1=new Employee();
       
       e1.setId("11");
       e1.setFirstName("Oleg");
       e1.setLastName("Ivanov");
       e1.setSalary(5500);
       
       emp.insertEmployee(e1);	
       
        
	   Employee e2=new Employee();
	   e2=emp.findEmployeeById("11");
	   		//Employee ee = emp.findEmployeeById("3");
		assertNotNull (e2);	
					 	
     }	   
	   
		
			       
}	
		

		//complete the code here
    		 
	

