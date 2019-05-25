/**
* This is a demo class to demonstrate packages
*/
package packageOne; // Adds itself to packageOne
public class ClassOne {
	private int i; // Only accessable from inside the same class
	private String s; // Only accessable from inside the same class
	private void displayI() { // Only accessable from inside the same class
		System.out.println("This is from ClassOne," + 
											"where value of i = " + i);
	}
	
	public String toString() { // Can be accessed from any where
		return "I = " + i + " S = " + s;
	}
}
