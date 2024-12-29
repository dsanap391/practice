package first;

//Write a java program to find the sum of Fibonacci series.

public class Fourth {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int num = 5;
		int sum =1;
		System.out.print(n1+" "+n2);
		for(int i=0;i<=num;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			sum=sum+n3;
		}
		System.out.println(" \nSum "+sum);
	}
}
