package day08;

public abstract class Animal extends Object{ //Object 클래스는 모든 클래스의 부모클래스
	String kind = "동물의 종류";
	public Animal() { //기본생성자는 만들어 놓는게 좋음.
		super();
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public abstract void breath(); 
	
	public void print() { }
}