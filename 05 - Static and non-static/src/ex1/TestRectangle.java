package ex1;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,20);
		System.out.println("Area: " + rect.getArea());
		System.out.println("Counter: " + rect.getCounter());
		System.out.println("Height: " + rect.getHeight());
		System.out.println("Width: " + rect.getWidth());
		System.out.println("Color: " + rect.getColor());
	}
}
