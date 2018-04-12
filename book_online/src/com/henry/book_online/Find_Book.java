package com.henry.book_online;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Find_Book {
	public static void findbook() {

		// 判断存放图书信息的映射Map是否为空
		if (Add_Newbook.bookmap == null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("暂无图书信息,无法查找");

		}

		else {
			while (true) {
				int menu = usefulchose();
				if (menu == 0) {
					break;

				} else {
					if (menu == 1) {
						while (true) {
							findbybookname();
							break;
						}
					} else {
						while (true) {

							findbybookauthor();
							break;
						}
					}

				}

			}

		}
	}

	public static int findmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择根据图书的书名查找或作者查找");
		System.out.println("0、退出本次查找");
		System.out.println("1、根据书名查找");
		System.out.println("2、根据作者查找");
		int chose = sc.nextInt();
		return chose;
	}

	// 判断有效输入
	public static int usefulchose() {
		while (true) {
			int usefulchose = findmenu();
			if (usefulchose >= 0 & usefulchose <= 2) {
				return usefulchose;
			}
		}
	}

	// 根据图书名查找
	public static void findbybookname() {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入书名：");
		String bookname = sc.next();

		// 获取所有的key
		Set<String> keys = Add_Newbook.bookmap.keySet();
		for (String key : keys) {
			if (bookname.equals(key)) {
				System.out.println(Add_Newbook.bookmap.get(bookname).toString());
			}

		}
	}

	// 根据作者查找
	public static void findbybookauthor() {
		Book_Father findbook = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入作者名：");
		String bookauthor = sc.next();

		Iterator<Map.Entry<String, Book_Father>> it = Add_Newbook.bookmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Book_Father> entry = it.next();
			if (entry.getValue().bookauthor.equals(bookauthor)) {
				findbook = entry.getValue();
				System.out.println(findbook.toString());
			}
		}
	}

}