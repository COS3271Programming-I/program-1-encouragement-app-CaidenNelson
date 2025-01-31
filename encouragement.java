package looker;
import java.util.Scanner;

public class Encouragement {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		
		
		
		System.out.println("What is your first name?");
		firstName = userinput.nextLine();
		
		System.out.println("What is your middle name?");
		middleName = userinput.nextLine();
		
		System.out.println("What is your last name?");
		lastName = userinput.nextLine();
		
		System.out.printf("Good job" + ' '+ firstName +' '+ middleName +' '+ lastName +' '+ "\uD83D\uDE38");
	}

}
