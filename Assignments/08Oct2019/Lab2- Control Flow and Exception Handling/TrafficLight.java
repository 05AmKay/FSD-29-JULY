import java.util.*;

class TrafficLight{
	public static void main(String[] args){
		System.out.println("1. Red ");
		System.out.println("2. Yellow ");
		System.out.println("3. Green ");
		System.out.print("Select an option: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch(choice){
			case 1: System.out.print("Stop");
			break;

			case 2: System.out.print("Ready");
			break;

			case 3: System.out.print("Go");
			break;

			default: System.out.print("invalid selection");
		}

	}
}