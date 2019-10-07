import java.util.*;

class OddNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		for(int i=num; i<=86; i++){
			if(!(i%2==0)){
				System.out.print(i+",");
			}	
		}
	}
}