package day10_collection;

public class EmployeeTest {
	public static void main(String[] args) {
		/*
		Employee<String> emp = new Employee<String>("홍길동", "2019001");
		System.out.println(emp.number.charAt(0));
		
		Employee<Integer> emp1 = new Employee<Integer>("김길동", 1);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("이길동", "2019002"); //제네릭 선언안해주면 object 타입으로 선언됨 어떤 type이든지 허용됨
		System.out.println(emp2.number);//object는 다운 캐스팅하지않으면 자원접근 안됨
		*/
		Employee<String, String> emp1 = new Employee<String, String> ("홍길동","20190-001");
		System.out.println(emp1);
		
		Employee emp2 = new Employee("홍길동","20190-001");
		System.out.println(emp2);
	}
}
