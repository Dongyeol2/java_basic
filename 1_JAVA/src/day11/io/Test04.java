package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 { //파일 input스트림 기존에 파이있으면 생서, 없응면 없다고 알려줌
	public static void main(String[] args) {
		String filename = "C:\\lib\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int count = 0;
		int read = 0;

		try {
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("C:\\lib\\copy.mp3",false); //true,false로 append 할 수 있음
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
//			byte[] buffer = new byte[1024*1024];
			
			System.out.println(" *** 파일 복사 시작 ***");
			while((read = bis.read()) != -1) {
				bos.write(read); //read해서 buffer만큼 파일의 끝까지 가져오겠다.
				count++;
			}
			bos.flush(); //혹시나 버퍼 비워져있지 않으면 버퍼 비워줌
			System.out.println("IO 횟수 : "+count);
			System.out.println("*** 파일 복사 완료 ***");
		
		}catch(FileNotFoundException e) {
			System.out.println("복사할 파일을 선택해주새요");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
