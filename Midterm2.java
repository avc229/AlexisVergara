/**
 * 
 * @author Alexis
 *
 */

import java.util.Scanner;
public class Midterm2 {
	static int fact(int n) {
		int res=1;
		while(n!=0) {
			res=res*n;
			n--;
		}
		return res;
			
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		int num;
		System.out.println("Please enter an integer to find the factorial");
		int n = input.nextInt();
		int res=fact(n);
		System.out.println("Factorial of " +n+ " is " +res);
//		}
//		
	}

}
