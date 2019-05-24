package day07;

public class test04 extends Object{
	public static void main(String[] args) {
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리안허스크", "케리");
		
		Animal a = f;
		
		a.breath();
		a.print();
		f.print();
		
		f.breath();
	}
}
