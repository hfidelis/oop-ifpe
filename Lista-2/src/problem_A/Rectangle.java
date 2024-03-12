package problem_A;

public class Rectangle {
	private double height = 0, base = 0;
	
	Rectangle() {}
	
	Rectangle(double v1, double v2) {
		this.height = v1;
		this.base = v2;
	}
	
	Rectangle(double v1) {
		this.height = v1;
		this.base = v1;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setHeight(double value) {
		this.height = value;
	}
	
	public void setBase(double value) {
		this.base = value;
	}
	
	public void showArea() {
		double area = this.height * this.base;

		System.out.println("A área do retângulo é: " + area);
	}
	
	public void duplicateHeight() {
		double doubleHeight = (this.getHeight() * 2);
		this.setHeight(doubleHeight);
	}
	
	public void reverseSides() {
		double temp = this.height;
		this.height = this.base;
		this.base = temp;
	}
}