package day07;

public class Prob7 {
	public static void main(String[] args) {
		Person[] p = { 
				new Student("홍길동", 20, 200201), 
				new Student("김길동", 21, 200202), 
				new Student("고길동", 22, 200203), 
				new Teacher("이순신", 30, "JAVA"), 
				new Teacher("김순신", 31, "SQL"), 
				new Teacher("최순신", 32, "C"), 
				new Employee("유관순", 40, "교무과"),
				new Employee("이관순", 41, "행정실"),
				new Employee("박관순", 42, "원무과")
		};
		for(int i = 0; i < p.length; i++) {
			if(p[i] instanceof Student) {
				System.out.print("학번 : "+((Student)p[i]).getStuNum());
				System.out.println(p[i].getName().charAt(0)+"**");
			
			}
		}
		//두개 같은 의미
//		for(Person data : p)
//			System.out.println(data.getName());

	}
	
	
	public static void personPrint(Person p) {
		p.print();
	}
}
