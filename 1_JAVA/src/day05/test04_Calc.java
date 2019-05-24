package day05;

public class test04_Calc {
	public static void main(String[] args) {
		System.out.println(Calc.add(99, 11)); //static한 메소드 주소값없이 class명으로 바로 접근가
		System.out.println(Calc.add(99, 11)); //import하거나 타입선언만 하면 사용가능
		System.out.println(Calc.add(99, 11,1,2,3,4,5,6,67)); 
		
	}
}
