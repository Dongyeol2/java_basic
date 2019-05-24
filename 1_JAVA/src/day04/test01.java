package day04;

import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		double m = 0.0;
		int[] jumsu; //배열 선언;
		jumsu = new int[5]; //배열 생성
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 70;
		jumsu[3] = 60;
		jumsu[4] = 50;
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]+" , ");
		}
//		System.out.println();
//		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); //배열 출력 api
		
		String[] names; //스트링은 클래스이기 때문에 도트 사용가능 하지만 int배열은 기본형이기때문에 도트 사용불가
		names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		names[3] = "";
		
		System.out.println(Arrays.toString(names));
		System.out.println("===============================");
		for(int i = 0; i < jumsu.length; i++) {
			m += jumsu[i]/jumsu.length;
		}
		
		for(int i = 0; i < jumsu.length; i++) {
			if(names[i] != null && names[i].length() > 0)
				System.out.printf("%c** : %3d \n",names[i].charAt(0),jumsu[i]);
			else
				System.out.printf("이름없음 : %3d \n", jumsu[i]);
		}
		
		System.out.printf("학생평균 : %.2f", m);
	
	}
}
