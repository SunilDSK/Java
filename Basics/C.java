/**
* class A to demonstrate that the file name and class name need not be same
*/
class A {
 public static void main(String[] args) {
  System.out.println("This is something that is not from the book");
 }
}

/**
* One java file can have multiple classes in it
*/
class B {
 void display() {
  System.out.println("This is from class B");
 }
 
 public static void main(String[] args) {
  B b = new B();
  b.display();
 }
}

/**
* File name should be same as public class in that java file
*/
public class C {
 void displayC() {
  System.out.println("This is from class C");
 }

 public static void main(String[] args) {
  C c = new C();
  c.displayC();
 }
}
