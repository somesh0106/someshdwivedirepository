package Project;

import com.reature.pro.model.EmployeeCenter;
import com.revature.pro.Exception.CustomException;
import java.util.*;
import java.util.logging.Logger;

public class EmployeeValues {
	static Logger logger = Logger.getLogger("EmployeeValues.class");
	public void InsertValues(EmployeeCenter center)throws CustomException{
		logger.info("=================Value======================");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Details");
		
		
		
		 System.out.println("Employee id ");
		 int eid= s.nextInt();s.nextLine();
		 
		 System.out.println("Employee name");
		 String ename=s.next();
		 
		 System.out.println("Employee Address");
		 String eaddress = s.next();
		 
		 System.out.println("Employee Salary");
		 String salary = s.next();
		 
		 System.out.println("Employee Departmentid");
		 String Ddtid= s.next();
		 
		 System.out.println("Employee Gender");
		 String gender=s.next();
		
		 
		 center.setEid(eid);
		 center.setEname(ename);
		 center.setSalary(salary);
		 center.setEaddress(eaddress);
		 center.setDdtid(Ddtid);
		 center.setGender(gender);
	}

}
