package day01;

import java.util.Date;

public class Sample03 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today : "+today);
		
		java.sql.Date d; //둘다 date이기 때문에 하나는 풀패스로
		
		System.out.println(Integer.MAX_VALUE); 
		System.out.println((int) 'a'); 
		char c = 'c';
		System.out.println(Character.isDigit(c));
		System.out.println(1/(int)2.);
	}
}
