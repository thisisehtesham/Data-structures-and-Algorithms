package arrays;

import java.util.Scanner;

public class Multidimentional2DArray {

	public static void main(String[] args) {
		
		//Syntax-> int a[][] = new int[][];
		
//		int b[][] = {
//		            {3,1,5,7,2},
//		            {4,1,7},
//		            {1,2,3,5,6,8} };
//		System.out.println(b[1][2]);
		
		
	    //Taking input of two matrix and the addition of that is storing.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the dimentions");
//		
//		int rows = sc.nextInt();
//		int cols = sc.nextInt();
//		
//		int a[][] = new int[rows][cols];
//		int b[][] = new int[rows][cols];
//		
//		System.out.println("Enter array a");
//		
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Enter array b");
//		
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				b[i][j] = sc.nextInt();
//			}
//		}
//		
//		int c[][] = new int[rows][cols];
//		
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}	
//		}
//		System.out.println("Result array c is: ");
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				System.out.print(c[i][j] +" ");
//			}
//			System.out.println();
//			}
//		----------------------------------------------------------------------------
//		int a[][] = new int[5][3];
//		
//		System.out.println(a[2][1]);
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the dimensions");
	    
	    int rows = sc.nextInt();
	    int cols = sc.nextInt();
	    
	    int a[][] = new int[rows][cols];
	    int b[][] = new int[rows][cols];
	    
	    System.out.println("Enter Array a");
	    
	    for(int i = 0; i <rows; i++) {
	    	for(int j =0;j<cols; j++) {
	    		a[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Enter Array b");
	    
	    for(int i = 0; i <rows; i++) {
	    	for(int j =0;j<cols; j++) {
	    		b[i][j] = sc.nextInt();
	        }
	    }
	    int c[][] = new int[rows][cols];
	    
	    for(int i = 0; i <rows; i++) {
	    	for(int j =0;j<cols; j++) {
	    		c[i][j] = a[i][j] + b[i][j];
	        }
	    }
	    System.out.println("Result Array c is: ");
	    
	    for(int i = 0; i <rows; i++) {
	    	for(int j =0;j<cols; j++) {
	    		System.out.print(c[i][j] +" ");
	        }
	    	System.out.println();
	    }
	}
}
