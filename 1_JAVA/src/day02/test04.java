package day02;

import java.util.Scanner;
public class test04 {
	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
		System.out.println(num++);
		
		Scanner input = null;
		String msg = "hello java programming";
		String msg2 = "hello java programming!!!";
		
		boolean flag = num < 15 && msg.length() > 0;
		
		
		System.out.println(num == msg.length());
		System.out.println(msg.equals(msg2));
		System.out.println(msg == msg2);
		
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(4 << 2);
		System.out.println(4 >> 1);
		System.out.println(4 & 1);
		
		input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = input.nextInt();
		input.nextLine();

		input.close();
		input = null;
		
		System.out.println("유효성 검증");
		if(!(jumsu >= 0 && jumsu <= 100)) {
			return;
		}
		System.out.println(jumsu >= 80 ? "PASS" : "NO PASS"); //삼항 연산자
		
		
		System.out.println("END");
	
	}
}
