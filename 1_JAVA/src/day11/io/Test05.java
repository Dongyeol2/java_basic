package day11.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05 { //파일 input스트림 기존에 파이있으면 생서, 없응면 없다고 알려줌
	public static void main(String[] args) {
		String filename = "C:\\lib\\DBinfo.txt";
		FileReader fis = null;
		FileWriter fos = null;
		
		BufferedReader bis = null;
		BufferedWriter bos = null;
		
		int count = 0;
		int read = 0;

		try {
			fis = new FileReader(filename);
			fos = new FileWriter("C:\\lib\\copy.txt",false); //true,false로 append 할 수 있음
			
			bis = new BufferedReader(fis);
			bos = new BufferedWriter(fos);
			
			System.out.println(" *** 파일 복사 시작 ***");
			while((read = bis.read()) != -1) {
				bos.write(read); //read해서 buffer만큼 파일의 끝까지 가져오겠다.
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
