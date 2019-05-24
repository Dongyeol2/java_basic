package day07;

class Animal extends Object{ //Object 클래스는 모든 클래스의 부모클래스
	String kind = "동물의 종류";
	String name = "동물의 이름";
	public Animal() { //기본생성자는 만들어 놓는게 좋음.
		super();
	}
	public Animal(String kind, String name) {
		//super();
		this.kind = kind;
		this.name = name;
	}
	
	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
	public void print() {
		
	}
}

class Dog extends Animal {
	String kind;
	String name;
	public Dog() {
		super("강아지과", "강아지이름");
		//super.kind = "강아지";
	}
	public Dog(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("동물[%s : %s, %s : %s]\n",super.kind, kind,super.name, name);
		super.breath();
	}
	
	
	
}