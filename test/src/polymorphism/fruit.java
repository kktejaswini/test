package polymorphism;

import com.wipro.polymorphism.apple;
import com.wipro.polymorphism.fruit;
import com.wipro.polymorphism.orange;

public class fruit {
	String name;
	 String taste;
	 
	 }
class apple extends fruit{
	 void eat() {
		 System.out.println("apple is tasty");
       
	 } 
}
class orange extends fruit{
	 void eat()
	 {
		 System.out.println("orange is tasty");


	 }
}
class fruits
{
	 public static void main(String args[])
	 {
		 apple A=new apple();
		 A.eat();
		 orange O=new orange();
		 O.eat();
		 
	 }
}
