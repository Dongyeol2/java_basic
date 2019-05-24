package day07;

public class Student extends Person {
	private int stuNum;
	public Student() {
		super();
	}
	public Student (String name, int age, int stuNum) {
		super(name, age);
		this.stuNum = stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void print() {
		System.out.printf("이름 : %s, 나이 : %d , 학번 : %d\n",
				super.getName(), super.getAge(), stuNum);
	}
}
