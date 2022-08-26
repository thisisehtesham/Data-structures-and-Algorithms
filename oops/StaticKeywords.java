package oops;

public class StaticKeywords {
	
//	class Person {
//		int age;
//		String name;
//		
//	static String breed = "Homo Sapiens";
//	}
	
	static {
		System.out.println("in block 1");                    //static block (Which Executes before main)
	}
	static {
		System.out.println("in block 2");                    //static block (Which Executes before main)
	}

	public static void main(String[] args) {
	
//		System.out.println(Math.max(23, 12));                //Math class
		
		System.out.println("inside main");
	}
		static {
			System.out.println("in block 3");                //static block (Which Executes before main)
		}	
	
}
