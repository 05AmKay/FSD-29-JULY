import java.util.*;

class StringReversal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		// System.out.println(str);
		String reverse = "";
		
		int first;
		for( int last =str.length()-1; last>=0;last--){
			reverse += str.charAt(last);
		}
		System.out.println("Reversal of string is: " + reverse);
	}
}