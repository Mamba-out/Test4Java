package com.henry.book_online;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Add_Newbook {

	static Map<String, Book_Father> bookmap = new HashMap<String, Book_Father>();

	public static void addbook(String bookname, String bookauthor, String bookpress, String booktime, int bookpages,
			int booknumber, float bookprice) {

		Book_Father book_son = null;
		book_son = new Book_Father(bookname, bookauthor, bookpress, booktime, bookpages, booknumber, bookprice);

		bookmap.put(bookname, book_son);
	}

}
