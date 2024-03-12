package problem_A;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 3);
		Rectangle r2 = new Rectangle(250, 100);

		r2.setBase(75);
		r1.duplicateHeight();
		
		r1.showArea();
		r2.showArea();
		
		r1.reverseSides();
		
		r1.setBase(r2.getHeight());
		
		r1.showArea();
		r2.showArea();
	}
}
