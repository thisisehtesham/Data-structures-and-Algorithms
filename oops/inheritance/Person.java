package oops.inheritance;

public class Person {
	
    protected String name;
    
    public Person(String name) {
    	this.name = name;
    	System.out.println("inside Person Constructore");
    }
    
    public void walk() {
//    	System.out.println("Person is walking");
    	
//    	System.out.println(name + " is walking");
    	
    	System.out.println("person "+name + " is walking");       //Method Overriding
    }
    
    public void eat() {
//    	System.out.println("Person is eating");
    	
//    	System.out.println(name + " is eating");
    	
    	System.out.println("person "+name + " is eating");        //Method Overriding
    }
    
    public static void laughing() {
    	System.out.println("person is laughing");
    }
}
