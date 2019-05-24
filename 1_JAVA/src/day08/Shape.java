package day08;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
		super();
	}
	public Shape(String name) {
		this.name = name;
	}
	public abstract void calculationArea();
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void circleprint() {
		System.out.printf("%s의 면적은 : %.13f\n", name, area);
	}
	public void rectangleprint() {
		System.out.printf("%s의 면적은 : %.1f\n", name, area);
	}
}
