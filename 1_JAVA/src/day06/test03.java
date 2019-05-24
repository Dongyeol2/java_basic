package day06;

public class test03 {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		
		//System.out.println(new test03().max(a,b));
		max(a,b); // -> 원래는 day06.test03.max(a,b); 인데 어차피 max 함수는 static으로 이미 heap영역에 메모리 떠져있음
		new test03().min(a,b);
	
	}
	
	public static int max(int a, int b) {
		a = 1;
		return a > b ? a : b; 
	}
	
	public int min(int a, int b) {
		return a > b ? b : a;
	}
}
