package day06;

public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count+ "개 입니다.");
	}
}

class Product {
	static int count = 0;
	int serialNo;  //static 초기화(1번만) -> 초기화 함수 -> 기본생성자 함수
//	static {
//		++count;
//		serialNo = count; //static 초기화에서는 static변수만 사용가능함.
//	}	
	//초기화 함수
	{ 
		++count;
		serialNo = count;
	}
	
	public Product() { //기본 생성자
//		++count;
//		serialNo = count;
	}
	
}
