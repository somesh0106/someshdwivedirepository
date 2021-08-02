package com.revature.pro.service;

import java.util.logging.Logger;

import com.reature.pro.model.EmployeeCenter;
import com.revature.pro.Exception.CustomException;
import dao.EmployeeDAO;
import dao.EmployeeDAOImp;

public class EmployeeSerivceImp implements EmployeeSerivce {
	static Logger logger = Logger.getLogger("EmployeeSeriveImp.class");

	EmployeeDAOImp dao = new EmployeeDAOImp();
	public void addEmployeeCenter(EmployeeCenter center)throws  CustomException
	{
		logger.info("=================Service 1======================");
		try{
			dao.addEmployeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void DeleteEmployeeCenter(EmployeeCenter center)throws CustomException
	{
		
		logger.info("=================Service 2======================");
		try{
			dao.DeleteEmployeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void DisplayEmployeeDetails(EmployeeCenter center)throws CustomException{
		logger.info("=================Service 3======================");
		try{
			dao.DisplayEmployeeDetails(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void UpdateEmployeeData(EmployeeCenter center)throws CustomException
	{
		logger.info("=================Service 4======================");
		
		try{
			dao.UpdateEmployeeData(center);
		}
		catch(Exception e){
			throw new CustomException("Invalid serive update  data");
		}
	}

}
