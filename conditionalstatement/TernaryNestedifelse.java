package conditionalstatement;

public class TernaryNestedifelse {

	public static void main(String[] args) {
		
		int a = 12, b =180, c=100;
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("Largest of the three number is " + result);

	}

}
