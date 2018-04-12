package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class Change_Book {
	public static void changebook() {
		// 判断存放图书信息的映射Map是否为空
		if (Add_Newbook.bookmap == null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("暂无图书信息,无法修改");

		} else {
			ShowAll.showall();

			String newbookname = usefulbookname();

			Scanner sc = new Scanner(System.in);

			System.out.println("请输入修改以后该图书的以下信息");

			System.out.println("书名");
			String bookname = sc.next();

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

			if (bookname.equals(newbookname)) {
				Add_Newbook.bookmap.put(bookname, new_book_son);
			} else {
				Add_Newbook.bookmap.put(bookname, new_book_son);
				Add_Newbook.bookmap.remove(newbookname);
			}
			System.out.println("修改成功");
			ShowAll.showall();
		}
	}

	// 判断输入的书名是否存在
	public static String usefulbookname() {

		while (true) {
			String newbookname = changebookname();
			// 获取所有的key
			Set<String> keys = Add_Newbook.bookmap.keySet();
			for (String key : keys) {
				if (newbookname.equals(key)) {
					return newbookname;
				}

			}
		}

	}

	public static String changebookname() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的书名：");
		String newbookname = sc.next();
		return newbookname;
	}
}
