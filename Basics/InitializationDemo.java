/**
* Class InitializationDemo, demonstrates the order of initialization, where the
* order is - 
* 1st -> Fields
* 2nd -> initializer blocks
* 3rd -> Constructor if any invaked
*/
public class InitializationDemo {
	
	public InitializationDemo() {
		name = "Some name";
		System.out.println("Side constructor");
	}
	
	public static void main(String[] args) {
		InitializationDemo demo = new InitializationDemo();
		System.out.println(demo.name);
	}
	
	private String name = "Fluffy";
	
	{ System.out.println("setting field"); }
	
}
