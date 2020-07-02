package classandobject;

import com.wipro.classandobject.volumeofbox;

public class volumeofbox {
	private int width;
	private int height;
	private int depth;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	void display() {
		System.out.println(depth*width*height);
	}

	public static void main(String[] args) {
		volumeofbox vb = new volumeofbox();
		vb.setWidth(10);
		vb.setHeight(20);
		vb.setDepth(30);
		vb.display();
		
		
 		
}
}
