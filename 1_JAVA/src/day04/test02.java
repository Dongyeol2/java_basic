package day04;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(num));
		int[] num2 = num; //num2 배열은 num배열과 같은 주소공간을 레퍼런스 함
		System.out.println(Arrays.toString(num2));
//		
//		num2[0] = 77;
//		num[0] = 11;
//		System.out.println(Arrays.toString(num2));
		
		int[] num3 = num.clone(); //num배열을 복제하는 api
		System.out.println(Arrays.toString(num3));
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
	}

}
