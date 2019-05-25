/**
* This a demo class ClassTwo to demonstrate packaging
*/
package packageOne; // Adds itself to packageOne
import packageOne.ClassOne;
public class ClassTwo {
	public void display() {
		System.out.println("This is from ClassTwo");
	}
	public void displayClassOne() {
		ClassOne one = new ClassOne();
		one.display();
		System.out.println("This is after calling ClassOne's display.");
	}
}
