package arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//Asking for numbers of students and then marks and calculating the average marks
		
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of student");
//        int n = sc.nextInt();
//        int marks[] = new int[n];
//        System.out.println("Enter the marks");
//        
//              for(int i = 0; i<n; i++) {
//            	  marks[i] = sc.nextInt();
//              }
//              
//              int averageMarks = 0;
//              for(int i = 0; i<n; i++) {
//            	  averageMarks += marks[i];
//            	 
//              }
//              averageMarks /=n;
//              System.out.println("The average marks are "+ averageMarks);
		
		//Defining an array(1).
           
//		int [] marks = new int[5];
//		 System.out.println(marks[4]);
		
		//Defining an array(2).
		
//		int[] age = {2, 5, 1, 34, 12};
//		double[] marks = {1.2, 3.4, 3.6, 6.1};
//		marks[1] = 9.4; //Changing the value
//		
//		for(int i = 0; i < age.length; i++) {
//		
//		System.out.println(marks[i]);
//		}
		
		//Asking for numbers of students and then marks and calculating the average marks
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students");
		
		 int n = sc.nextInt();
		    
		   int[] marks = new int[n];
		   
		   System.out.println("Enter the marks now");
		   
		   for(int i = 0; i < n; i++) {
			   marks[i] = sc.nextInt();
		   }
		   int averageMarks = 0;
		   
		   for(int i = 0; i < n; i++) {
			   averageMarks += marks[i];
		   }
		   averageMarks /= n;
		   System.out.println("The average marks are "+ averageMarks);
		   
		   }
	}
