package day02;
import java.util.Date;

public class test01 {
	public static void main(String args[]) {
		char i = 'A';
		i = 'a';
		System.out.println(i);
		
		Date d = new Date();
		System.out.println(d.toLocaleString()); // 작대기 : 옛날엔 썼는데 지금은 쓰지마 하는 표시
		Date d2 = d;
		
		d = null;
		
		String ss = new Date().toString();
		
		String s1 = new String("hello"); // new 키워드로 쓰면 힙으로 올라간다.
		String s11 = new String("hello"); // new는 계속 메모르에 올라감. 
		
		String s2 = "hello"; // 올라가는 메모리 영역이 다르다. 코드프리에 올라감 
		String s22 = "hello"; // 하나의 영역만 쓰기때문에 메모리 할당이 적다.
		
		double pi = Math.PI;
		double r = (int)(Math.random()*45+1);
		int r1 = (int)Math.random();
		System.out.println(pi + ", "+ r + ", " + r1);
		System.out.printf("PI : %.4f r : %.2f r1 : %d", pi, r, r1);
		
		
		
	}
}
