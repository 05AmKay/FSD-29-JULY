import java.util.*;

class FirstNameAndLastNameEmptyException extends RuntimeException{
	String FirstAndLastNameException(){
		return "First Name or Last Name should not be empty";
	}
}

class UserExceptionForFirstAndLastName{

	void ValidateName(String firstName, String lastName) throws FirstNameAndLastNameEmptyException{
		if(firstName.length() == 0 || lastName.length() == 0){
			throw new FirstNameAndLastNameEmptyException();
		}else{
			System.out.println("User name varified successfully");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last Name: ");
		String lastName = sc.nextLine();
		try{
			new UserExceptionForFirstAndLastName().ValidateName(firstName, lastName);
		}
		catch(FirstNameAndLastNameEmptyException fle){
			System.out.println("Exception Caught: " + fle +" : " + fle.FirstAndLastNameException());
		}
	}
}