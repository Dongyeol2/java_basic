package day09_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		System.out.println("start");
		try (Scanner input = new Scanner(new File("c://lib/bookdata.txt"))){
			while(input.hasNextLine()) {
				String data = input.nextLine();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				System.out.println("Read : "+ data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일을 준비해주세요");			
		} catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
}
