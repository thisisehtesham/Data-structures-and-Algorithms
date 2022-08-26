package Delete;

import java.util.Scanner;

public class Expand The String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("--------------------Test Cases Start--------------------");
            System.out.println();
            System.out.print("Enter the string to expand : ");
            String str = sc.next();
            char ch [] = str.toCharArray();
            if(ch.length%2!=0) {
                System.out.println(); 
                System.out.println("Invalid String");
                continue;
            }
            String temp ="";
            for (int i=0; i<ch.length-1; i=i+2) {
                 char num = ch[i+1];
                 if(!(num>= (int)'0' && num<= (int)'9') && !(ch[i]>='a' && ch[i]<='z')) {
                	 System.out.println();
                	 System.out.println("Invalid String");
                	 temp ="";
                	 break;
                 }
                 int noOfTimes = Integer.parseInt(num+"");
                 while(noOfTimes-- >0) {
                	 temp+=ch[i];
                 }
            }
            if(!temp.isEmpty()) {
	            System.out.println("The result for the expanded string is : "+temp);
            }
            System.out.println();
            System.out.println("--------------------Test Cases End--------------------");
        }
    }
}