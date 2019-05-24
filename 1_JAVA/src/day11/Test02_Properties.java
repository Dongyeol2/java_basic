package day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test02_Properties {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("DBinfo.txt"));
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(user+"/"+pw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//컬렉션 프레임웍 : 다수의 데이터 손쉽게 처리할 수 있는 방법을 제공하는 클래스로 구성
//collection(부모) -> list, set(자식들)
//Vector는 구버전, Arraylist는 신버전. vector는 동기화처리 되어있음(Syncronize), Arraylist는 안되어있음.

