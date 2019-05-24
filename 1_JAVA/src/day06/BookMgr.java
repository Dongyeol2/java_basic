package day06;

public class BookMgr {
	private Book[] booklist;
	int count = 0;
	
	public BookMgr() {
		 booklist = new Book[5];
	}

	public void addBook(Book book) {
		if(count == booklist.length) {
			Book[] temp = new Book[count+1];
			//booklist 0번째 index부터 tmep배열 0번째 인덱스로 복사, 사이즈는 boolist의 사이즈만큼
			System.arraycopy(booklist, 0, temp, 0, booklist.length); //arraycopy : 배열 복사
		}
		for(int i = 0; i < booklist.length; i++) {
			if(booklist[i] == null) {
				booklist[i] = book;
				count++;
				break;
			}
		}
	}

	public void printBookList() {
		System.out.println("===책목록====");
		for (int i = 0; i < booklist.length; i++) {
			if(booklist[i] != null)
				System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for (int i = 0; i < booklist.length; i++) {
			if(booklist[i] != null)
				sum += booklist[i].getPrice();
		}
		System.out.println(sum);
	}

}
