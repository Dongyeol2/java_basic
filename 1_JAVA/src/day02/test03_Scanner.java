package day02;

import java.util.Scanner;
public class test03_Scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하세요_");
		System.out.println();
		String name = input.nextLine();
		
		System.out.print("나이를 입력하세요_");
		System.out.println();
		int age = Integer.parseInt(input.nextLine());
		
		System.out.println("국어/영어/수학 점수를 입력하세요_");
		System.out.println("입력 예) 90 90 70 처럼 점수흫 입력 후 엔터");
		
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		input.nextLine();
		
		System.out.println("*** 입력정보 확인 ***");
		System.out.printf("이름 : %s, 나이 : %d %n",name,age);
		System.out.printf("국어 : %d, 수학 : %d, 영어 : %d, 평균 : %.2f %n",
				k1,k2,k3, (k1+k2+k3)/3.);
		System.out.println("*** 입력정보 확인 ***");
		
		
		
		input.close(); // scanner 클래스 닫아줌
		
		
	}
}
