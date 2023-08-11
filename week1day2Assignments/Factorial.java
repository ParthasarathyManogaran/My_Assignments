package week1day2Assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output =1;
Scanner scanner =new Scanner(System.in);
System.out.println("Enter the Number:");
int input =scanner.nextInt();
for (int i = 1; i <= input; i++) {
	  output =output*i;
}
System.out.println(output);
	}

}
