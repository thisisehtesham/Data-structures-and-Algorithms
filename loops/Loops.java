package loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//Print Hello World 100 times.
//		for(int i = 0; i < 100; i = i+1) {
//			
//			System.out.println("Ghosia Zeenet " +i);
//		}
//		}
		
		
        //Print Even numbers from 0 to 100.
//		for(int i = 0; i <= 100; i = i+2) {
//			System.out.println(i);
//		}
		
		
		//Print sum of numbers
		
//		int sum = 0;
//		int n = 5;
//		for(int i = 1; i <= n; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		}
		//Print reverse counting 100-1.
//		for(int i = 100; i > 0; i--) {
//			System.out.println(i);
//		}
		
		//Print tables .
//		int tableof = 4;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(tableof * i);
//		}
		
        //Finding Factorial entered by user.
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int factorial = 1;
//		 for (int i = n; i >= 1; i--) {
//			 factorial = factorial * i;
//		 }
//			 System.out.println(factorial);
//	 }

		
		//Finding Fibonacci series of n terms, n is given by user (0,1,1,2,3,5,8,13,21....).
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//	    int a = 0;
//	    int b = 1;
//	    System.out.print(a+ " ");
//	    System.out.print(b+ " ");
//	    for(int i = 0; i <= n-2; i++) {
//	    	int c = a + b;
//	    	System.out.print(c+" ");
//	    	a = b;
//	    	b = c;
//	    	
//	    }
//	}	
//}		
		
		//Two numbers are entered through the keyboard. Find the value of one number raised to the poweer of another.
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int result = 1;
//		for(int i = 0; i < b; i++) {
//			result *= a;
//		}
//		System.out.println(result);
//	}
//	
//}
		
		//Finding prime number (2,3,5,7,...)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		boolean isPrime = true;
//		for(int i = 2; i < n; i++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if(n < 2) isPrime = false;
//		
//		    System.out.println("isPrime " + isPrime);
//	}
//}
		
        //Calculate the sum of series where n is input by user. (1 + 1/2 + 1/3 + 1/4 + 1/5 +.....1/n)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		float result = 0;
//		for(float i = 1; i <= n; i++) {
//			result += 1/i;
//		}
//		System.out.println(result);
//	}
//}
		
		//Calculate the sum of series wheren is input by  user. (1 - 1/2 + 1/3 - 1/4 + 1/5 +.....1/n)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		float result = 0;
//		for(float i = 1; i <= n; i++) {
//			if(i % 2 == 0) {
//				result -= 1/i;
//			} else {
//				result += 1/i;
//			}
//		}
//			System.out.println(result);
//	}
//}	
		
		//Break
//		for(int i = 1; i<=100; i++) {
//			if(i == 35){
//			break;
//		}
//		System.out.println(i);
//		}
//	}
//}
		
		//Continue: Skips the curent loop and moves to the next loop.
		for(int i = 1; i <= 100; i++) {
			if(i >= 40 && i <= 50) {
				continue;
			}
			System.out.println(i);
		}
	}	
}
		
		
		
