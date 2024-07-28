package JavaPractice;

public class Arrays2 {

	public static void main(String[] args) {
		
		//char
		char [] ch = {'D', '&', '8', '+', '~'};

		//		ch[0]= 'D';
		//		ch[1]= '&';
		//		ch[2]= '8';
		//		ch[3]= '+';
		//		ch[4]= '~';

		for(char c : ch) {
			System.out.println(c);
		}
		
		//String
		String [] sarray = {"Hey", "I", "am", "there."};

		for(String s : sarray) {
			System.out.println(s);
		}
		
		//float
		float [] farray = {23.56f, 456.1f, 1.235f, 8965.1f, 0.2535f};
		
		for(float f : farray) {
			System.out.println(f);
		}
		
	}

}
