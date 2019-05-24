package day07;

public class test03_Dog {
	public static void main(String[] args) {
		Dog d = new Dog("시베리안허스키", "케리");
		d.print();
		
		d.breath();
		System.out.println(d.kind); //자기 kind 호출
		System.out.println(((Animal)d).kind); //부모 kind 호출
		
		Object a = new Dog("시베리아허스키", "케리"); //가장 상위 클래스이기 때문에 a.해도 지꺼밖에 안보임 -> 다음캐스팅해야됨
		if(a instanceof Animal)//a가 Animal타입이면 캐스팅하고 아니면 하지말라는 뜻
			System.out.println(((Animal)a).kind);
		
		if(a instanceof Dog) //a가 Dog타입이면 캐스팅하고 아니면 하지말라는 뜻
			System.out.println(((Dog)a).kind); //다운캐스팅 방법
		
		if(a instanceof String) //a가 String이면 하고 아니면 안하고
			System.out.println(((String)a).toString());
	}
}
