package day11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test03 { //파일 input스트림 기존에 파이있으면 생서, 없응면 없다고 알려줌
	public static void main(String[] args) {
		String filename = "C:\\lib\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int count = 0;
		int read = 0;

		try {
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("C:\\lib\\copy.mp3",false); //true,false로 append 할 수 있음
			
			byte[] buffer = new byte[1024*1024];
			
			System.out.println(" *** 파일 복사 시작 ***");
			while((read = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, read); //read해서 buffer만큼 파일의 끝까지 가져오겠다.
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
