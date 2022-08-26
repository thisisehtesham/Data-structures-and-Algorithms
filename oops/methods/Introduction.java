package oops.methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber, secondNumber);
//		int result = maxOf(100, 200);
//		int result = maxOf(2, 4);
		
		System.out.println(result);
		
		sayHi();
		
		sayHi();
		
		maxOf(12, 45);
	}	
	
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static void maxOf(float a, float b) {
		
	}
			
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}

