package day04;

import java.util.Arrays;

public class test05 {
	//args는 초기에 비어있는 배열, args는 null일 수 없다. null과 비교 ㄴㄴ
	//들어왔는지 아닌지는 args.length로 쳌
	//args.length가 0이라는 얘기는 배열 인덱스 쓰면 안됨.
	public static void main(String[] args) {
//		System.out.println(args);
//		System.out.println(args.length);
//		System.out.println(Arrays.toString(args));
//		System.out.println(args.length);
		
		if(args.length == 0) {
			System.out.println("사용방법");
			System.out.println("java day04.Test05 홍길동/90/77/88");
			System.out.println("성적 데이터를 입력해주세요..");
			return;
		}
		
		System.out.println("성적처리");
		String[] data = args[0].split("/");
		System.out.println(Arrays.toString(data));
		
		int sum = 0;
		for(int i = 1; i < data.length; i++) {
			sum += Integer.parseInt(data[i]);
		}
		System.out.printf("%s : %.2f",data[0], sum/3);
			
	}
}
