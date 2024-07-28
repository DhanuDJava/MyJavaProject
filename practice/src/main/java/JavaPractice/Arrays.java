package JavaPractice;

public class Arrays {

	public static void main(String[] args) {

		String str = "abcd";

		//define an array
		String [] arr= new String [5];

		//initialize or declare or assign values to array
		arr[0] = "Nashik";
		arr[1] = "Pune";
		arr[2] = "Mumbai";
		arr[3] = "Raigad";
		arr[4] = "Kokan";

		System.out.println(arr.length);
		System.out.println(arr[4]);

		for(int i = 0; i<arr.length; i=i+1) {
			System.out.println(arr[i]);
		}

		for(String s : arr) {
			System.out.println(s);
		}

	}

}
