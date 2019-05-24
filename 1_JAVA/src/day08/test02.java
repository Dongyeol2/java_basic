package day08;

import day07.Person;
import day07.Student;

public class test02 {
	public static void main(String[] args) {
		Object[] obj = {
				new Fish("쿠피"),
				new Dog("시베리안 허스키", "케리"),
				"hello java",
				new Student("000", 22, 1),
				new Student("000", 22, 2),
		};
		
		for(Object o : obj) {
			exec(o);
		}
	}
	
	public static void exec(Object o) {
		if(o instanceof Person)
			((Person)o).print();
		if(o instanceof Student)
			((Student)o).print();
	}
}
