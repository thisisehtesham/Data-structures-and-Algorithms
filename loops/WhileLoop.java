
package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		//Fnind the sum of the digits of a number. ( e.g. For the given number 523, the sum is 10)
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int temp = n;
//		int sum = 0;
//		
//		while(temp>0) {
//			int lastDigit = temp % 10;
//			temp /= 10;
//			
//			sum += lastDigit;
//		}
//		System.out.println("The sum of the digits of " + n +" is "+ sum );
//		}

        //Write a program to check if a given number is palindrom or not.(12321,121)
		
		Scanner sc = new Scanner(System.in);
		     int n = sc.nextInt();
		     int temp = n;
		     int reversedNumber = 0;
		     
		     while(temp > 0) {
		    	 int lastDigit = temp % 10;
		    	 reversedNumber = reversedNumber * 10 + lastDigit;
		    	 temp /= 10;
		     }
		     if(reversedNumber == n) {
		    	 System.out.println(n +" is palindrom");
		     } else {
		    	 System.out.println(n +" is not a palindrom");
		    	 
		     }
		
	}
}
