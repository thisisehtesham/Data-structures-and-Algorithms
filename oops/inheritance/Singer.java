package oops.inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
		System.out.println("inside singer constructor");
	}
	
	public void sing() {
//		System.out.println("Singer is singing");
		
		System.out.println(name + " is singing");
	}
	
	public void eat() {
		System.out.println("singer "+name + " is earing");      //Method Overriding
	}
	
	public static void laughing() {
	    System.out.println("singer is laughing");
	}

}
