import java.util.*;

class Factorial2{

	int fact(int num){
		
		if(num>=1){
			return num*fact(num-1);
		}
		else{
			return 1;
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		Factorial2 f = new Factorial2();
		int fa = f.fact(num);
		System.out.println("fact is "+ fa);
	}
}