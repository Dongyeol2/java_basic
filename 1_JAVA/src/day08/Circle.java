package day08;


class Circle extends Shape{
	private double radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void calculationArea() {
		super.area = radius * radius * Math.PI;
	}
}