package JavaPractice;

public class Array0to10print {
	
	public static void main(String[] args) {
		
		int [] ar = new int[11];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		
		for(int x : ar) {
			System.out.println(x);
		}
	}

}
