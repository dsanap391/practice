package first;

import java.util.Scanner;

//find the factorial of given number

public class Second {
	public static void main(String[] args) {
		int fact= 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number : "+fact);
	}
}
