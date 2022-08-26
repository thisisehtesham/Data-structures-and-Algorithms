package Lists.VectroAndStacks;

import Lists.LinkedList.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();

	    void push(E e ) {
	    	ll.add(e);
			
		}
        
		E pop() throws Exception {
			if(ll.isEmpty()) {
				throw new Exception("Popping from empty stack is not allowed");
			}
			return ll.removeLast();
		}
		
		E peek() throws Exception {
			if(ll.isEmpty()) {
				throw new Exception("peeking from empty stack is not allowed");
			}
			return ll.getLast();
		}
}


//Question:- check-if-given-parentheses-expression-is-balanced-or-not.

//import java.util.*;
//import java.lsng.*;
//import java.io.*;
//
//class GFG{
//    public static Void main (String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int t = sc.nextInt();
//      sc.nextLine();
//      while(t-- !=0) {
//        String s = sc.nextLine();
//        Stack<Character> Stack = new Stack<>();
//        
//        boolean isBalanced = true;
//        
//        for(int i =0; i<s.length(); i++) {
//          char ch = s.charAt(i);
//          if(ch == '(' || ch == '{' || ch == '[') {
//            stack.push(ch);
//            continue;
//          }
//
//            if(stack.isEmpty()) {
//            	isBalanced = false;
//            	break;
//            }
//            
//          if(ch == ')') {
//            if(stack.peek() == '(') {
//              stack.pop();
//            } else {
//              isBalanced = false;
//              break;
//            }
//            if(ch == '}') {
//              if(stack.peek() == '{') {
//                stack.pop();
//            } else {
//              isBalanced = false;
//              break;
//            }
//            if(ch == ']') {
//              if(stack.peek() == '[') {
//                stack.pop();
//            } else {
//              isBalanced = false;
//              break;
//            }
//        }
//    }
//    if(!stack.isEmpty()) {
//        isBalanced = false;
//    }
//    if(isBalanced) {
//      System.out.println("balanced");
//    } else {
//      System.out.println("not balanced");
//    }
//    }
//  }
//}








