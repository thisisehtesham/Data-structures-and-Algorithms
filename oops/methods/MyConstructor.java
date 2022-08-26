package oops.methods;

class Vehicle {
	
	 int wheels;
	 int headLights;
	 String color;
	 
	 Vehicle() {                                       //Default Constructor
		 
	 }
	 
//	 Vehicle() {                                       //No-Argument Constructor
//		 wheels = 4;
		 
//		 Vehicle(int noOfWheels) {                     //Parameterized Constructor
//			 wheels = noOfWheels;
//			 headLights = 2;
			 
	     Vehicle(int wheels) {                     
				 this.wheels = wheels;                 //"this" keyword(points current object)
				 headLights = 2;
	 }
	     Vehicle(int wheels, String color) {           //Constructor Overloading
	    	 this.wheels = wheels;
	    	 this.color = color;
	    	 headLights = 2;
	     }
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		

//		MyConstructor obj = new MyConstructor();
		
//		Vehicle car = new Vehicle();                   //No-Argument Constructor
//		Vehicle car2 = new Vehicle();
		
		Vehicle car = new Vehicle(4);                  //Parameterized Constructor
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, " Yellow");  //Constructor Overloading
		
		Vehicle random = new Vehicle();                //Default Constructor
		
		System.out.println(car.wheels +" wheels");
		System.out.println(scooty.wheels +" wheels");
		System.out.println(eRikshaw.wheels +" wheels and color =" + eRikshaw.color); //Constructor Overloading
	}

}
