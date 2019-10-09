import com.cg.eis.exception.EmployeeException;
import java.util.*;

class EmployeeSalaryCheck{

	void validateSalary(int salary) throws EmployeeException{
		if(salary<3000){
			throw new EmployeeException();
		}else{
			System.out.print("Employee salary is: " + salary);
		}
	}


	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter salary: ");
		int salary = sc.nextInt();

		try{
			new EmployeeSalaryCheck().validateSalary(salary);
		}catch(EmployeeException ee){
			System.out.println("Exception caught: " + ee +" : " + ee.checkSalary());
		}
	}
}