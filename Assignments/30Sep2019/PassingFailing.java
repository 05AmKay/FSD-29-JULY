import java.util.Scanner;

class PassingFailing{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Third Number: ");
		int num3 = sc.nextInt();
		int count = 0;
		if(num1 >= 40)
			count++;
		if(num2 >= 40)
			count++;
		if(num3 >= 40)
			count++;
		if((num1 + num2 + num3) >= 125)
			count++;
		if(count==4)
			System.out.println("PASSING");
		if(count<4)
			System.out.println("FAILING");
	}
}