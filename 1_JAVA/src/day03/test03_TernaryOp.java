package day03;

import java.util.Scanner;

public class test03_TernaryOp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("성적처리 Application 시작하려면 yes를 입력하세요_");
		
		String msg = input.nextLine();
		
		if(!(msg != null && msg.equalsIgnoreCase("yes"))) { //equalsIgnoreCase : 대소문자 구분 없이	
			System.out.println("성적처리 Application stop");
			if(input != null) {
				input.close();
				input = null;	
			}
			return;
		}
		System.out.println("성적처리 Application start");
		System.out.println("성적을 입력하세요..");
		System.out.println("국어 영어 수학 \n예) 90 90 90 엔터");
		
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		input.nextLine();
		
		double m = 0.0;
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d %n", k1, k2, k3);
		System.out.printf("평균 : %.2f %n", m = (k1+k2+k3)/3);
		
		//등급처리
		//double m = 99;
		
		//삼항연산자 이용
		char grade = (m >= 90 && m <= 100) ? 'A' :
					 (m >= 80 && m < 90) ? 'B' :
				     (m >= 70 && m < 80) ? 'C' :
					 (m >= 60 && m < 70) ? 'D' : 'F';
		
		System.out.printf("성적처리결과 [%c] %n" ,grade);
		
		//Scanner 자원반납 코드
		if(input != null) {
			input.close();
			input = null;
		}
	}
}
