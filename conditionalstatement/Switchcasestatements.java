package conditionalstatement;

public class Switchcasestatements {

	public static void main(String[] args) {
//		int dayofweek = 2;
//		
//		switch(dayofweek) {
//		case 1:
//		    System.out.println("I am on leave");
//		    break;
//		case 2:
//		    System.out.println("I am in office");
//		    break;
//		case 3:
//			System.out.println("I am playing football");
//			break;
//			
//			default:
//			System.out.println("I don't know what day it is");
//			
//		
//		}
//
//	}
//
//}
		// Asking if 1 or 2 rating then bad, if 3 then average and 4 or 5 then Good rating.
		
         int rating = 3;
        	switch(rating) {
        	case 1:
            case 2:
        	     System.out.println("bad review");
        	      break;
            case 3:
            	System.out.println("Average review");
            	break;
            case 4:
            case 5:
            	System.out.println("Good review");
            	break;
        	}
	}
          }    