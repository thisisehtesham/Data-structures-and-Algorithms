package Lists.Deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ad.addFirst(12);
//		ad.addFirst(23);
//		
//		ad.pop();
		
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
//		System.out.println(ad.peek());
		System.out.println(ad.pop());
		

	}

}
