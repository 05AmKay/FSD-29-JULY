import java.util.Scanner;

class FibonocciByRecursive{
	static int a=1,b=1,c;
	void FiboRec(int num){
		if(num>0){
			c = a+b;
			a = b;
			b = c;
			System.out.print( c +" ");
			FiboRec(num-1);
		} 
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");	
		int num = sc.nextInt();
		int a=1, b=1;
		System.out.println("Fibonocci Series upto a given number: ");
		System.out.print(a +" "+ b +" ");
		FibonocciByRecursive ob = new FibonocciByRecursive();
		ob.FiboRec(num-2);

	}
}