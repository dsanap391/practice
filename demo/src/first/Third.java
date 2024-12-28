package first;

import java.util.Scanner;

//Calculate simple interest from given principal

//formula -> simple interest = (P*R*T)/100

public class Third {

	public static void main(String[] args) {
		
		double principal;
		double rate_of_interest;
		int time_in_year;
		double  simple_interest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		principal = sc.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		rate_of_interest = sc.nextDouble();
		
		System.out.println("Enter time in year: ");
		time_in_year = sc.nextInt();
		
		simple_interest = (principal*rate_of_interest*time_in_year)/100;
		
		System.out.println("Simple interest: "+simple_interest);
	}
}
