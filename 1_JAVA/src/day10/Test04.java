package day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		Set<Book> set = new TreeSet<Book>(); //treeset은 중복제거  됨
		set.add(new Book("hello", 1900));
		set.add(new Book("java", 900));
		set.add(new Book("sql",3000));
		set.add(new Book("java",2900));
		set.add(new Book("spring",31000));
		set.add(new Book("spring",31000));
		System.out.println(set);
		
//		for(Book data:set) {
//			System.out.println(data);
//		}
		Iterator<Book> it = set.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			if(book.getTitle().equalsIgnoreCase("sql"))
				it.remove();
		}
		System.out.println(set);
	}
}
