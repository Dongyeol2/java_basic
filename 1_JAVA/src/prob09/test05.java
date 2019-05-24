package prob09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		//System.out.println("start");
		try (Scanner input = new Scanner(new File("c://lib/bookdata.txt"))){
			BookMgr mgr = new BookMgr();
			while(input.hasNextLine()) {
				Book book = new Book();
				String data = input.nextLine();
				String[] bookdata = data.split("/");
				book.setTitle(bookdata[0]);
				book.setPrice(Integer.parseInt(bookdata[1]));
				mgr.addBook(book);
			}
			mgr.printBookList();
			mgr.printTotalPrice();
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일을 준비해주세요");			
//		} catch (Exception e) {
//			System.out.println("bookdata parsing error");
//			System.out.println(e.getMessage());
		}
	}
}
