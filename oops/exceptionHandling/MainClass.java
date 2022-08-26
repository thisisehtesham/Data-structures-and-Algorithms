package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
//	try {
//		int a = 5;
//		int b = 0;
//		int c = a/b;
//		System.out.println(c);
		
//		int a[] = new int[5];
//		System.out.println(a[6]);
//		
//    } catch(ArithmeticException e) {
//	    System.out.println(e.getMessage() +" Occured, Please check your code.");
//	} catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("Index should be in the ange of 0 to size of array.");
//	} catch(IllegalArgumentException e) {
//		System.out.println("Check you casting carefully.");
//	} finally {
//		System.out.println("sorry for the inconvenience.");
//	}
//	
//		System.out.println("Very important code");
//		System.out.println("Need Student");
		
		fun1();
  }
	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b;
		System.out.println(c);
		
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("Danger was coming");
//			}
//		try {
//	        fun2();
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        System.out.println("Afeter delay");
//		} catch(Exception e) {
//			System.out.println(e.getMessage()+" occured");
//		}
	    
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
	}
}
}

