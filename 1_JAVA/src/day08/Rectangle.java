package day08;

class Rectangle extends Shape{
	private int width;
	private int height;
	Rectangle() {
		super();
	}
	Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setHeiht(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public void calculationArea() {
		super.area = this.height * this.width;
	}
}