package Lists.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
//		List<String> fruits = new ArrayList();
		List<String> vegetables = new LinkedList();
		
//		fruits.add("Apple");
//		fruits.add("Orange");
//		fruits.add("Banana");
//		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
	
//		fruits.addAll(vegetables);                               //addAll function		
//		System.out.println(vegetables.get(1));                   //get function
//		vegetables.set(1, "Onion");                              //set function
//		vegetables.remove(2);                                    //remove function
//      vegetables.clear();                                      //clear function
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Potato");
//		toRemove.add("Carrot");
//	    vegetables.removeAll(toRemove);                          //removeAll function

//		System.out.println(vegetables.size());                   //size function
//		System.out.println(vegetables.contains("Guava"));        //contains function
//		System.out.println(vegetables.isEmpty());                //isEmpty function
		
		String temp[] = new String[vegetables.size()];
		vegetables.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
		
//		ArrayList<Integer> marks = new ArrayList();
//		
//		Double x =45.0;
//		
//		Pair<String, Integer> p1 = new Pair("Anuj", 457);
//		
//		Pair<Boolean, String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription();

	}

}
