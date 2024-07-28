package JavaPractice;

public class Switch {
	
public static void main(String [] args) {
 
	int num1= 3;
	
	//1 --> Apple
	//2 --> Orange
	//3 --> Mango
	//4 --> Pomegrante
	//5 or higher --> No such fruit
	
	if(num1 == 1) {
		System.out.println("Apple");
	}else if(num1 == 2) {
		System.out.println("Orange");
	}else if(num1 == 3) {
		System.out.println("Mango");
	}else if(num1 == 4) {
		System.out.println("Pomegrante");
	}else System.out.println("No such fruit");
	
	switch(num1) {
	case 1:
		System.out.println("Apple");
		break;
	case 2:
		System.out.println("Orange");
		break;
	case 3:
		System.out.println("Mango");
		break;
	case 4:
		System.out.println("Pomegrante");
		break;
		
	default: System.out.println("No such fruit");
	}
}
		

}
