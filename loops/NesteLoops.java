package loops;

public class NesteLoops {

	public static void main(String[] args) {
		//Five times 1-10 counting.
//		for(int j = 1; j<=5;j++) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		}
	
		//Table from 1-20.
		
		for(int j = 1; j <= 20; j++) {
		    int tableOf = j;
		    for(int i = 1; i <= 10; i++) {
			    System.out.print(tableOf * i+ " ");
        }
		System.out.println();
	    }	
	}
}
