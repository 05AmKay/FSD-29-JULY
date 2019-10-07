import java.util.*;

class DecimalToBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rem;
		int binary = 0, i =1;

		// System.out.println(str);
		
		while(num>0){
			rem = num % 2;
			binary = binary + (rem*i);
			num = num/2;
			i*=10;
		}

		System.out.println("Binary equivalent is " + binary);
	}
}