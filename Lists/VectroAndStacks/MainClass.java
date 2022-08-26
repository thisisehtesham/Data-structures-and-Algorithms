package Lists.VectroAndStacks;


import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector();              //Vector
//		
//		v.add(34);
//		v.add(12);
		
		MyStack<Integer> stack = new MyStack();            //Stack
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
        int peeked = stack.peek();
		
		System.out.println(peeked);
		
		
	}

}
