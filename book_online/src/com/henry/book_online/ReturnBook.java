package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class ReturnBook {
	public static void returnbook() {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要归还的书名：");
		String returnbookname = sc.next();

		boolean have = returnbooknamhave(returnbookname);

		if (have) {
			Add_Newbook.bookmap.get(returnbookname).booknumber++;
		} else {
			nothavebook(returnbookname);

		}
		System.out.println("图书" + returnbookname + "归还成功");
		ShowAll.showall();

	}

	public static boolean returnbooknamhave(String bookname) {

		String newbookname = bookname;

		boolean have = false;
		// 获取所有的key
		Set<String> keys = Add_Newbook.bookmap.keySet();
		for (String key : keys) {
			if (newbookname.equals(key)) {
				have = true;
				break;
			}

		}

		return have;

	}

	public static void nothavebook(String bookname) {
		Scanner sc = new Scanner(System.in);
		System.out.println("您归还的该图书信息缺失");
		System.out.println("请补全该图书的以下信息");

		// System.out.println("书名");
		// String bookname = sc.next();

		System.out.println("作者");
		String bookauthor = sc.next();
		System.out.println("出版社");
		String bookpress = sc.next();
		System.out.println("出版时间");
		String booktime = sc.next();

		System.out.println("页数");
		int bookpages = sc.nextInt();
		System.out.println("库存数量");
		int booknumber = sc.nextInt();
		System.out.println("价格");
		float bookprice = sc.nextFloat();

		System.out.println("你修改以后该图书信息如下：");
		System.out.println("书名：" + bookname + ", 作者：" + bookauthor + ", 出版社：" + bookpress + ", 出版时间：" + booktime
				+ ", 页数：" + bookpages + ", 库存数量：" + booknumber + ", 价格：" + bookprice);

		Book_Father new_book_son = null;

		new_book_son = new Book_Father(bookname, bookauthor, bookpress, booktime, bookpages, booknumber, bookprice);
		Add_Newbook.bookmap.put(bookname, new_book_son);
	}
}
