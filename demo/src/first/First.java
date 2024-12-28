package first;

//Swapping two numbers without using third variable

public class First {

	public static void main(String[] args) {
		int a=2;
		int b=5;
		
		System.out.println("Before Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		a = a-b;
		b = b+a;
		a = b-a;
		
		System.out.println("\nAfter Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}
