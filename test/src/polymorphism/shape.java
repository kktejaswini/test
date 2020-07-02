package polymorphism;

import com.wipro.polymorphism.circle;
import com.wipro.polymorphism.shape;
import com.wipro.polymorphism.square;
import com.wipro.polymorphism.triangle;

public class shape {
	void draw()
	{
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("erasing shape");
	}

}
class circle extends shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("erasing circle");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase()
	{
		System.out.println("erasing triangle");
	}
}
class square extends shape{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("erasing square");
	}
}
class poly{
	public static void main(String args[]) {
		shape c=new circle();
		c.draw();
		c.erase();
		shape t=new triangle();
		t.draw();
		t.erase();
		shape s=new square();
		s.draw();
		s.erase();

	}
}
