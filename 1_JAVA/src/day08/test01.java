package day08;

import static java.lang.Math.PI;
public class test01 {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(Math.random());
	
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리아허스키", "케리");
		
		exec(f);
		exec(d);
	}
	
	public static void exec(Animal a) {
		a.breath();
		a.print();
	}

}
