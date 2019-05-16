/**
* Class ConstructorDemo, to demonstrate class name can be method name and 
* not just constructor name
*/
public class ConstructorDemo {
	public void ConstructorDemo () {
		System.out.println("This is not a constructor");
	} 
	public static void main(String[] args) {
		ConstructorDemo f1 = new ConstructorDemo();
		f1.ConstructorDemo();
		System.out.println("This is something that is not from the book");
	}
}
