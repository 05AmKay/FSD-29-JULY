import java.util.*;

class AgeIs15Exception extends RuntimeException{
	String Is15Exception(){
		return "Age should not be less than 15";
	}
}

class ValidatePersonAge{
	
	void validateAge(int age) throws AgeIs15Exception{
		if(age<=15){
			throw new AgeIs15Exception();
		}else{
			System.out.println("welcome user");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = sc.nextInt();
		System.out.println(age);

		try{
			new ValidatePersonAge().validateAge(age);
		}
		catch(AgeIs15Exception aie){
			System.out.print("Exception is: " + aie +": "+ aie.Is15Exception());
		}
	}
}