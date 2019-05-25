/**
* This is a driver program. It uses classes from pachageOne.
*/
package packageTwo; // Adds itself to packageOne
import packageOne.*; // Imports all the classes from packageOne
public class driver {
	public static void main(String[] args) {
		ClassOne one = new ClassOne();
		ClassTwo two = new ClassTwo();
//		one.display(); // Compilation error
		two.display();
	}
}

class driverTwo extends ClassOne {
	public static void main(String[] args) {
		driverTwo one = new driverTwo();
		one.display(); 
	}
}
