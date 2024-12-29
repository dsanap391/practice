package first;

//find the largest element from the array

public class Sixth {
	public static void main(String[] args) {
		
		int[] arr= {7, 2, 0, 8, 5, 1, 4};
		int large = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > large){
				large = arr[i];
			}
		}
		System.out.println("Largest element: "+large);
	}
}
