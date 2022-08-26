package Lists.LinkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
//		List<Integer> ll = new LinkedList<>();
//		
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		
////		ll.set(2, 13);
////		ll.toArray();
//		
//		System.out.println(ll);
		
		
		
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);	
//	}
// 
//	static void getTimeDiff(List<Integer> List) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i = 0; i<100000; i++) {
//			
//			List.add(0, i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(List.getClass().getName() + " ---> "+(end - start));
		
		
		MyLinkedList<Integer> myll = new MyLinkedList();
		
//		myll.add(12);;
//		myll.add(56);
		
		for(int i = 0; i < 10; i++) {
			myll.add(i);
		}
		
		myll.print();
	}
}
