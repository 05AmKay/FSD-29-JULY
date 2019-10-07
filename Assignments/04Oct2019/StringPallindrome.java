import java.util.*;

class StringPallindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		System.out.println(str);

		// System.out.println(str.length());

		int last = str.length() - 1;
		int first =0;
		// System.out.println(last);
		int flag =0;

		while( first != last){
			if(str.charAt(first) == str.charAt(last)){
				last--;
				first++;
			}else{
				flag=1;
				System.out.println("String is not Pallindrome");
				break;
			}
		}
		if(flag==0){
			System.out.println("String is Pallindrome");
		}
	}
}