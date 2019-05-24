package day09_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner input = null;
		try {
			input = new Scanner(new File("c://lib/bookdata.txt"));
			int sum = 0;
			String[] list = new String[10];
			while(input.hasNextLine()) {
				String data = input.nextLine();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				System.out.println("Read : "+ data);
				sum += price;
				System.out.println(sum);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("bookdata.txt 파일을 준비해주세요");
			
		} catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		} finally {
			if(input != null)
				input.close();			
		}
		
		System.out.println("end");
	}

}
