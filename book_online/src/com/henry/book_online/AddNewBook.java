package com.henry.book_online;

import java.util.Scanner;

public class AddNewBook {
	public static void addbook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ͼ���������Ϣ");

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

		System.out.println("��¼���ͼ����Ϣ���£�");
		System.out.println("������" + bookname + ", ���ߣ�" + bookauthor + ", �����磺" + bookpress + ", ����ʱ�䣺" + booktime
				+ ", ҳ����" + bookpages + ", ���������" + booknumber + ", �۸�" + bookprice);
		System.out.println("¼��ɹ�");

		Add_Newbook.addbook(bookname, bookauthor, bookpress, booktime, bookpages, booknumber, bookprice);

	}
}
