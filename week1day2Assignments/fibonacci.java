package week1day2Assignments;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 =0;
		int a2 =1;
		int a3;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number:");
		int x =scanner.nextInt();
		System.out.println(a1);
		System.out.println(a2);
		for (int i = 2; i < x; i++) {
			a3 =a1+a2;
			a1 =a2;
			a2 =a3;
			System.out.println(a3);
			
		}
		

	}

}
