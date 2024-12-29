package first;

//calculate the sum of array elements

public class Fifth {
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,9};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("Sum of Array elements: "+sum);
	}
}
