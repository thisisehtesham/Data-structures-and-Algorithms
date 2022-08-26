package arrays;

public class BubbleShort {

	public static void main(String[] args) {
		int a[] = {2, 1, 8, -3, 4, 12};
		int n = a.length;
		
		for(int i = 0; i < n-1; i++) {
			
	      //boolean sorted = true;              //Optimised
			
			for(int j = 0; j < n-1; j++) {
	      //for(int j = 0; j < n-1-i; j++) {	//Optimised	
				if(a[j+1] < a[j]) {
				   int temp = a[j+1];
				   a[j+1] = a[j];
				   a[j] = temp;
				   
				  //sorted = false;             //Optimised
				}
			}
			    //if(sorted) break;             //Optimised
		}
            for(int item: a) {    //for-each loop.
            	System.out.print(item+" ");
	}
  }
}
