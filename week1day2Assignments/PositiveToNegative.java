package week1day2Assignments;

import java.util.Scanner;

public class PositiveToNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Positive Number:");
		int input =scanner.nextInt();
		if (input>0) {
			System.out.println(input*-1);
		}
else {
	System.out.println("Enter the correct number");
}
	}

}
