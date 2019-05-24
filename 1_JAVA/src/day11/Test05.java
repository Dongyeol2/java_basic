package day11;

import java.util.ArrayList;
import java.util.List;

import prob09.Book;

public class Test05 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("java",500));
		books.add(new Book("SQL",500));
		books.add(new Book("servlet&jsp",500));
		books.add(new Book("html5",500));
		books.add(new Book("java",500));
		books.add(new Book("java",500));
		
		books.forEach(i -> System.out.println(i.getTitle().charAt(0) + "**"));
	
		books.stream().forEach(i -> System.out.println(i));
		System.out.println();
		books.stream().distinct().forEach(i -> System.out.println(i)); //distinct : 중복제거 메소드
		
		long count = books.stream().filter(i -> i.getPrice() > 1500).count();
		System.out.println(count);
		
		int sum = books.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println(sum);
	}

}
