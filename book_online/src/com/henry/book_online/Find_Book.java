package com.henry.book_online;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Find_Book {
	public static void findbook() {

		// �жϴ��ͼ����Ϣ��ӳ��Map�Ƿ�Ϊ��
		if (Add_Newbook.bookmap == null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("����ͼ����Ϣ,�޷�����");

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
		System.out.println("��ѡ�����ͼ����������һ����߲���");
		System.out.println("0���˳����β���");
		System.out.println("1��������������");
		System.out.println("2���������߲���");
		int chose = sc.nextInt();
		return chose;
	}

	// �ж���Ч����
	public static int usefulchose() {
		while (true) {
			int usefulchose = findmenu();
			if (usefulchose >= 0 & usefulchose <= 2) {
				return usefulchose;
			}
		}
	}

	// ����ͼ��������
	public static void findbybookname() {

		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		String bookname = sc.next();

		// ��ȡ���е�key
		Set<String> keys = Add_Newbook.bookmap.keySet();
		for (String key : keys) {
			if (bookname.equals(key)) {
				System.out.println(Add_Newbook.bookmap.get(bookname).toString());
			}

		}
	}

	// �������߲���
	public static void findbybookauthor() {
		Book_Father findbook = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
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