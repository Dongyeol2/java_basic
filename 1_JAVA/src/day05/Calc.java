package day05;

public class Calc {
	//+ - * /
	public static int add(int a, int b) { //method 오버로딩 : 메소드 명은 같지만 기능 또는 변수의 타입, 변수 개수가 달라서
		return a + b; //이름이 같더라도 각각의 method가 하는 기능이 다름을 말함.
	}
	
	public static double add(double a, double b) { //static한 자원은 heap영역이 아니기 때문에 this자원 사용불가
		return a + b; //이 자원은 heap영역이기 때문에 변수들은 매개변수로 들어와야함
	}
	
	//가변인자 처리 : 많은 매개변수가 들어오더라도 ...하면 배열로 저장되어 모든 매개변수 처리 가능
	//주의 : 가변인자 method는 항상 함수의 가장 끝에 와야한다.
	public static double add(int ... a) {
		int sum = 0;
		for(int data : a) {
			sum += data;
		}
		return sum;
	}
	
	public static double sub(double a, double b) {
		return a - b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public static double div(double a, double b) {
		return a / b;
	}
}
