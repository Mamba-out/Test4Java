package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class Change_Book {
	public static void changebook() {
		// �жϴ��ͼ����Ϣ��ӳ��Map�Ƿ�Ϊ��
		if (Add_Newbook.bookmap == null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("����ͼ����Ϣ,�޷��޸�");

		} else {
			ShowAll.showall();

			String newbookname = usefulbookname();

			Scanner sc = new Scanner(System.in);

			System.out.println("�������޸��Ժ��ͼ���������Ϣ");

			System.out.println("����");
			String bookname = sc.next();

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

			if (bookname.equals(newbookname)) {
				Add_Newbook.bookmap.put(bookname, new_book_son);
			} else {
				Add_Newbook.bookmap.put(bookname, new_book_son);
				Add_Newbook.bookmap.remove(newbookname);
			}
			System.out.println("�޸ĳɹ�");
			ShowAll.showall();
		}
	}

	// �ж�����������Ƿ����
	public static String usefulbookname() {

		while (true) {
			String newbookname = changebookname();
			// ��ȡ���е�key
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
		System.out.println("������Ҫ�޸ĵ�������");
		String newbookname = sc.next();
		return newbookname;
	}
}
