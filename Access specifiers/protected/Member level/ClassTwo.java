/**
* This a demo class ClassTwo to demonstrate packaging
*/
package packageOne; // Adds itself to packageOne
import packageOne.ClassOne;
public class ClassTwo {
	public void display() {
		ClassOne one = new ClassOne();
		one.display();
		System.out.println("This is from ClassTwo");
	}
}
