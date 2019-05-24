package day10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03_Book {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
	//	List<Book> list = new Vector<Book>(); //모든객체의 부모객체는 사용가능 list는 arraylist, vector의 부모객체임
		
		list.add(new Book("hello", 1900));
		list.add(new Book("java", 900));
		list.add(new Book("sql",3000));
		list.add(new Book("java",2900));
		list.add(new Book("spring",31000));
		list.add(new Book("spring",31000));
//		System.out.println(list);
//		list.remove(new Book("spring",31000));
//		//Collections.sort(list);
//		
//		System.out.println(list);		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getTitle());
//		}
		
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			if(book.getTitle().equalsIgnoreCase("sql"))
				it.remove();
		}
		System.out.println(list);
		
		
		
				
	}

}

class Book implements Serializable, Comparable<Book>{ //Comparable은 순서를 정하기 위해서, Serializable은 스트링 통과를 가능하게 하기 위해서
	private String title;
	private int price;
	
	public Book() {
		
	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title  != null && title.length() > 0)
			this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}
//	@Override
//	public boolean equals(Object obj) {
//		boolean flag = false;
//		if(obj != null && obj instanceof Book) {
//			Book temp = (Book)obj;
//			if(title.equals(temp.title) && price == temp.price) {
//				flag = true;
//			}
//		}
//		return flag;
//	}
//	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		//return price - o.price //책의 가격으로 sort하겠다는 의미
		return title.compareTo(o.title); //오름차순 title이랑 o.title바꾸면 내림차순으로 책제목 순으로 정렬 가능
	}
	
}