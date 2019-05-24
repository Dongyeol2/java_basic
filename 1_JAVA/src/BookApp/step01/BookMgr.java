package BookApp.step01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMgr {
	Scanner in = new Scanner(System.in);
	private ArrayList<Book> booklist;
	int count = 0;

	public BookMgr() {
		booklist = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		booklist.add(book);
	}
	
	public void removeBook(String s) {
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(s)) {
				booklist.remove(i);
				System.out.println("정상적으로 삭제되었습니다.");
				printBookList();
			}
			else {
				System.out.println("삭제하고자 하는 책이 목록에 없습니다.");
				System.out.println("책 목록을 다시한번 확인하시기 바랍니다.");
				printBookList();
			}
		}
	}
	
	public void updateBook(String s) {
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(s)) {
				booklist.remove(i);
				System.out.print("변경할 책의 제목을 입력하세요 : ");
				String title = in.nextLine();
				System.out.print("변경할 책의 가격을 입력하세요 : ");
				int price = in.nextInt();
				Book book = new Book();
				book.setTitle(title);
				book.setPrice(price);
				addBook(book);
				System.out.println("정상적으로 변경되었습니다.");
				printBookList();
			}
			else {
				System.out.println("변경하고자 하는 책이 목록에 없습니다.");
				System.out.println("책 목록을 다시한번 확인하시기 바랍니다.");
				printBookList();
			}
		}
	}
	
	public void serchBook(String s) {
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(s)) {
				System.out.println("찾고자 하는 책이 목록에 존재합니다.");
			}
			else {
				System.out.println("찾고자 하는 책의 목옥이 존재하지 않습니다.");
				System.out.println("책 목록을 다시한번 확인하시기 바랍니다.");
				printBookList();
			}
		}
	}
	
	public void printBookList() {
		System.out.println("===========책목록============");
		booklist.forEach(i -> System.out.println(booklist.toString()));
	}

}
