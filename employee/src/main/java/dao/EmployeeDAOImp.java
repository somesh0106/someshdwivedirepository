package dao;
import com.reature.pro.model.EmployeeCenter;
import java.util.Scanner;
import dbutil.DBUtil ;
import com.revature.pro.Exception.CustomException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.*;
public  class EmployeeDAOImp implements EmployeeDAO 
{
	//insert the data
	public void addEmployeeCenter(EmployeeCenter center) throws  CustomException
	{
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection
			Connection con = dbutil.DBUtil.getConnection();
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","subi26");
			
			//statement
			//Statement st = con.createStatement();
			
			//create
			//st.executeUpdate("create table Employee2(eid int primary key,ename varchar(20),eaddress varchar(40),salary double, ddtid varchar(20),gender varchar(10))");
			
			
			//insert
			PreparedStatement pst=con.prepareStatement("insert into Employee2 values(?,?,?,?,?,?)");
			
			pst.setInt(1, center.getEid());
			pst.setString(2, center.getEname());
			pst.setString(3, center.getEaddress());
			pst.setString(4, center.getSalary());
			pst.setString(5, center.getDdtid());
			pst.setString(6, center.getGender());
			pst.execute();
	
			System.out.println("data inserted..");
		}
		catch (Exception e){
		
			throw new CustomException("Invalid insert data");
		}
		
		
		
	}
	
	
	public void DeleteEmployeeCenter(EmployeeCenter center)throws CustomException
	{
		try{
			
			Connection con = DBUtil.getConnection();
//			Statement st = con.createStatement();
//			st.executeUpdate("delete from employee2 where ename='subi'");
		
			PreparedStatement pst=con.prepareStatement("delete from employee2 where eid=?");
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();
			center.setEid(n);
			pst.setInt(1,center.getEid());
			pst.execute();
			
			System.out.println("Delete the data");

		}
		catch(Exception e){
			throw new CustomException("Invalid delete data");
		}
		
		
	}
	//display the data
	public void DisplayEmployeeDetails(EmployeeCenter center)throws CustomException{
		try{
			Connection con = DBUtil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee2");		
			//st.executeUpdate("delete from employee where  eid=2");
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "   "+ rs.getString(2)+"  "+rs.getString(3)+ "  "+ rs.getDouble(4)+ "  "+ rs.getString(5)+"  "+rs.getString(6));
			}
			
		}
		catch(Exception e){
			throw new CustomException("Invalid display data");
		}
	}
	//update the data
	public void UpdateEmployeeData(EmployeeCenter center)throws CustomException{
		try{
			Connection con = DBUtil.getConnection();
//			
//			Statement st = con.createStatement();
//			st.executeUpdate("update employee2 set ename='geethe' where eid=1");
//						
			PreparedStatement pst=con.prepareStatement("update employee2 set ename=? ");
			Scanner s= new Scanner(System.in);
			String name = s.next();
			center.setEname(name);
			
			pst.setString(1,center.getEname());
			pst.execute();

			System.out.println("update the date");
			
			
		}
		catch(Exception e){
			throw new CustomException("Invalid Update  data");
		}
	}
	

}
