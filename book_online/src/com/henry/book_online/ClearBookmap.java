package com.henry.book_online;

import java.io.*;
import java.util.Scanner;

public class ClearBookmap {
	public static void clearbookmap() {

		System.out.println("确定删除所有图书信息（Y/N）");

		// 调用函数判断有效输入
		String usefulchose = truechose();
 
		if (usefulchose.equals("Y")) {
			Add_Newbook.bookmap.clear();
			System.out.println("初始化成功");
			ShowAll.showall();
		} else {
			System.out.println("退出成功");
		}
	}

	public static String truechose() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			String chose = sc.next();

			if (chose.equals("Y") || chose.equals("N")) {
				return chose;
			} else {
				System.out.println("输入有误，请重新输入：");
			}
		}

	}

}
