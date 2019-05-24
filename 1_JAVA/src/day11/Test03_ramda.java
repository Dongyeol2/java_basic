package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test03_ramda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(77);
		list.add(78);
		list.add(79);
		list.add(87);

		for(Integer data : list) {
			System.out.println(data+"  ");
		}

		System.out.println("======================");
		list.forEach(new Consumer<Integer>() { //forEach : 순회하면서 해당값 가져옴. consumer객체 생성은 익명클래스 오버라이드 해줘야함
			@Override //구버전
			public void accept(Integer t) { //call back 메소드
				System.out.println(t+"  ");
			}
		});
		
//		System.out.println("======================");
//		list.forEach((Integer t) -> System.out.println(t+"  ")); //람다 사용

		System.out.println("======================");	
		list.forEach(t -> System.out.println(t+"  ")); //call back 함수 (신버전)
		list.removeIf(i -> i % 2 == 0); //removeIf : 조건식 만족하면 제거
		System.out.println("======================");	
		list.forEach(t -> System.out.println(t+"  ")); //call back 함수 (신버전)
		System.out.println("======================");	
		list.replaceAll(i -> i*10);
		list.forEach(t -> System.out.println(t+ "  "));
		
		
	}
}
