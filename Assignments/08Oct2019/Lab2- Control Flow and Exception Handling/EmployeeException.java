package com.cg.eis.exception;

public class EmployeeException extends RuntimeException{
	public String checkSalary(){
		return "Salary is below 3000";
	}
}