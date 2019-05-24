package day04;

import java.util.Arrays;

public class test03 {
	public static void main(String[] args) {
		//char[] c = new char[100];
		String msg = "hello java programming~~~~~~~~~~~~";
	
		char[] c;
		//c = new char[10];
		c = new char[msg.length()];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = msg.charAt(i);
		}
		
		for(char data : c) { //Inhenced for loop 타입 맞춰주고 c배열에서 data에 하나씩 가져온다.
			System.out.println(data);
		}
		
		System.out.println(Arrays.toString(c));
	
		int[] n1 = {1,2,3};
		int[] n2 = new int[n1.length*2];
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.arraycopy(n1, 0, n2, 1, n1.length); //배열 복사
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		
		for(int data : n2) {
			System.out.println(data);
		}
		
		char[] s = "SQL".toCharArray(); //char 배열에 문자 하나씩 저장
		System.out.println(Arrays.toString(s));
		
		String[] s3 = {"java", "sql", "cent os","R",msg};
		
		for(String data : s3) {
			if(data.length() > 5) {
				System.out.println(data);
			}
		}
		
		
		
	}
}