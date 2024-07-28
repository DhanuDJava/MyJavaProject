//Array Ascending and Descending Order

package JavaPractice;

import java.util.Arrays;

public class Arrayascendinganddescending {

	public static void main(String[] args) {

		int [] arr = new int [10];

		arr[0] = 45;
		arr[1] = 35;
		arr[2] = 48;
		arr[3] = 62;
		arr[4] = 45;
		arr[5] = 07;
		arr[6] = 40;
		arr[7] = 45;
		arr[8] = 29;
		arr[9] = 45;
		
		
		Arrays.sort(arr);
		
		//Ascending Order
		
//		System.out.println("Ascending Order:");
//		
//		for(int x : arr) {
//			System.out.println(x);
//		}
		
		//Descending Order
		
		System.out.println("Descending Order:");

		for(int i = arr.length-1; i >= 0; i--) { 
			  System.out.println(arr[i]); 
		}
		
	}

}
