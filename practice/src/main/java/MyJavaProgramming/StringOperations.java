package MyJavaProgramming;

public class StringOperations {

	public static void main(String [] args) {
		
		String str1 = "Apple";
		String str2 = "Orange";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1 +" "+ str2);
		System.out.println(str1.concat(" ").concat(str2));
		
		System.out.println(str2.length());
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));

		System.out.println(str1.toLowerCase().toUpperCase());
		System.out.println(str1.toLowerCase().contains("apl"));
		System.out.println(str1.toLowerCase().contains("ppl"));
		System.out.println(str1.replace('p', 'k'));
		System.out.println(str1.replaceAll("p", "22"));
		System.out.println(str2.substring(1, 5));
		
	}
	
}
