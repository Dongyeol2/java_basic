package BookApp.step01;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		while (true) {
			System.out.println("***************************");
			System.out.println("*****Book Application******");
			System.out.println("***************************");

			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.println("1. 입   력");
			System.out.println("2. 수   정");
			System.out.println("3. 삭   제");
			System.out.println("4. 검   색");
			System.out.println("5. 목록보기");
			System.out.println("6. 종   료");

			System.out.println("***************************");
			Scanner input = new Scanner(System.in);
			String in = input.nextLine();
			if (in == null || in.length() == 0) {
				in = "99";
			}

			switch (in.charAt(0)) {
			case '1':
				System.out.println("1. 입    력 서비스 ");
				System.out.print("책 제목과 가격을 입력하세요[ex) java/40000] : ");
				String data = input.nextLine().trim();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				Book book = new Book();
				book.setTitle(title);
				book.setPrice(price);
				mgr.addBook(book);
				System.out.println("정상적으로 입력되었습니다.");
				break;

			case '2':
				System.out.println("2. 수    정 서비스 ");
				System.out.print("수정하고자 하는 책의 이름을 입력하세요 : ");
				String up = input.nextLine();
				mgr.updateBook(up);
				break;

			case '3':
				System.out.println("3. 삭    제 서비스 ");
				System.out.print("삭제할 책 이름을 입력하세요 : ");
				String re = input.nextLine();
				mgr.removeBook(re);
				break;

			case '4':
				System.out.println("4. 검    색 서비스 ");
				System.out.println("검색하고자 하는 책의 이름을 입력하세요 : ");
				String se = input.nextLine();
				mgr.serchBook(se);
				break;

			case '5':
				System.out.println("5. 목록보기 서비스 ");
				mgr.printBookList();
				break;

			case '6':
				System.out.println("6. 종    료 서비스 ");
				break;

			}
			
			if (in.charAt(0) == '6')
				break;
		}
	}

}
