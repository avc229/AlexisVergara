/**
 * 
 * @author Alexis
 * description:
 * created:
 **/
import java.util.Scanner;
public class NameGetter {
	//main method, the program starts at the main method
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
		//Prompt the user for an input
		System.out.println("Enter Your Name and last name");
		//Wait for the input from the user
		//and grabs it, then store in variable
		String fname = input.nextLine();
		String lname = input.nextLine();
		//Reply to user
		System.out.println("Thank you, " + fname);
		System.out.println("Your last name is " + lname);
	}
}
