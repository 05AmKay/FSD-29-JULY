import java.util.*;

class PrimeNumberUptoAnInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		System.out.print("All prime numbers upto the given number " + number +" are: ");
		for (int i=1; i<=number; i++) {
			int count =0;
			for (int j=1;j<=number ;j++ ) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}
}