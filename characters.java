/**
 * 
 * @author Alexis
 *
 */

import java.util.Scanner;
public class characters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, please enter your first name: ");
		String fname = input.nextLine();
		System.out.println("Thank you, " + fname);
		System.out.println(fname + ", please enter the name of your pet");
		String pet = input.nextLine();
		System.out.println(fname + ", " + pet + " has " + pet.length() + " characters");
		
	}

}
