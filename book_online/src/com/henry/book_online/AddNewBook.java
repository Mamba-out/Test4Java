package com.henry.book_online;

import java.util.Scanner;

public class AddNewBook {
	public static void addbook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入该图书的以下信息");

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

		System.out.println("你录入的图书信息如下：");
		System.out.println("书名：" + bookname + ", 作者：" + bookauthor + ", 出版社：" + bookpress + ", 出版时间：" + booktime
				+ ", 页数：" + bookpages + ", 库存数量：" + booknumber + ", 价格：" + bookprice);
		System.out.println("录入成功");

		Add_Newbook.addbook(bookname, bookauthor, bookpress, booktime, bookpages, booknumber, bookprice);

	}
}
