package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class ReturnBook {
	public static void returnbook() {

		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�黹��������");
		String returnbookname = sc.next();

		boolean have = returnbooknamhave(returnbookname);

		if (have) {
			Add_Newbook.bookmap.get(returnbookname).booknumber++;
		} else {
			nothavebook(returnbookname);

		}
		System.out.println("ͼ��" + returnbookname + "�黹�ɹ�");
		ShowAll.showall();

	}

	public static boolean returnbooknamhave(String bookname) {

		String newbookname = bookname;

		boolean have = false;
		// ��ȡ���е�key
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
		System.out.println("���黹�ĸ�ͼ����Ϣȱʧ");
		System.out.println("�벹ȫ��ͼ���������Ϣ");

		// System.out.println("����");
		// String bookname = sc.next();

		System.out.println("����");
		String bookauthor = sc.next();
		System.out.println("������");
		String bookpress = sc.next();
		System.out.println("����ʱ��");
		String booktime = sc.next();

		System.out.println("ҳ��");
		int bookpages = sc.nextInt();
		System.out.println("�������");
		int booknumber = sc.nextInt();
		System.out.println("�۸�");
		float bookprice = sc.nextFloat();

		System.out.println("���޸��Ժ��ͼ����Ϣ���£�");
		System.out.println("������" + bookname + ", ���ߣ�" + bookauthor + ", �����磺" + bookpress + ", ����ʱ�䣺" + booktime
				+ ", ҳ����" + bookpages + ", ���������" + booknumber + ", �۸�" + bookprice);

		Book_Father new_book_son = null;

		new_book_son = new Book_Father(bookname, bookauthor, bookpress, booktime, bookpages, booknumber, bookprice);
		Add_Newbook.bookmap.put(bookname, new_book_son);
	}
}
