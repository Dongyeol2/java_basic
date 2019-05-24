package day06;

import java.util.Scanner;

public class Prob6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookMgr bookmgr = new BookMgr();
		
		boolean bol = true;
		while(true) {
			int cnt = 1;
			String sel;
			System.out.printf("%d번째 책 제목입력을 입력하세요: ", cnt);
			String title = input.nextLine();
			System.out.printf("%d번째 책 가격을 입력하세요: ", cnt);
			int price = input.nextInt();
			input.nextLine();
			Book book = new Book();
			book.setTitle(title);
			book.setPrice(price);
			bookmgr.addBook(book);
			cnt++;
			System.out.println("더 추가 : y, 그만 : n");
			sel = input.nextLine();
			if(sel == "n")
				break;
		}
		bookmgr.printBookList();
		bookmgr.printTotalPrice();
		
		input.close();
		input = null;
		
	}
}

