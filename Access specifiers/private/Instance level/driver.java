/**
* This is a driver program. It uses classes from pachageOne.
*/
package packageTwo; // Adds itself to packageOne
import packageOne.*; // Imports all the classes from packageOne
public class driver {
	public static void main(String[] args) {
		ClassOne one = new ClassOne();
//		one.displayI(); // This line will stop compilation as we are accessing private things
		System.out.println(one);
	}
}
