package day11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test02_buffer { //파일 input스트림 기존에 파이있으면 생서, 없응면 없다고 알려줌
	public static void main(String[] args) {
		String filename = "C:\\Users\\student\\Downloads\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int count = 0;
		int read = 0;

		try {
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("C:\\lib\\copy.mp3");
			
			byte[] buffer = new byte[fis.available()];
			
			System.out.println(" *** 파일 복사 시작 ***");
			while((read = fis.read(buffer)) != -1) {
				fos.write(buffer);
				count++;
			}
			System.out.println("IO 횟수 : "+count);
			System.out.println("*** 파일 복사 완료 ***");
		
		}
		catch(FileNotFoundException e) {
			System.out.println("복사할 파일을 선택해주새요");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
