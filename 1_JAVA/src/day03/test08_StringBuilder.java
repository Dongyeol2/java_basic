package day03;

public class test08_StringBuilder {
	public static void main(String[] args) {
		String msg = "hello java test !!!";
		String msg2 = "";
		StringBuilder sb = new StringBuilder(); //스트링 빌더 생성 버퍼의 역할
		
		for(int i = 0; i < msg.length(); i++) {
			//System.out.print((char)(msg.charAt(i)-32));
			//msg2 += (chqr)(msg.charAt(i)-32); -> 이런식으로 하면 안됨. 지연의 원인이 됨(성능 안좋음)
			sb.append((char)(msg.charAt(i)-32)); //스트링 빌더, 스트링 버퍼 똑같음 이렇게 해야 효율적으로 좋음
		}
		msg2 = sb.toString();
		System.out.println(msg);
		System.out.println(msg2);
		
//		String name = "홍길동";
//		System.out.println(name);
//		System.out.println(name.length());
//		System.out.println(name.charAt(0)+"**");
//		System.out.println("**"+name.charAt(name.length()-1));
//		System.out.println(name.substring(1,3));
		
	}
}
