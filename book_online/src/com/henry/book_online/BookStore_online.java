package com.henry.book_online;

public class BookStore_online {

	public static void main(String args[]) {
		// ��ȡѡ��Ĳ˵�ѡ��

		while (true) {

			int menu = MainMenu.usefulmenu();

			if (menu == 0) {

				System.out.println("�˳��ɹ�");
				break;

			}
			switch (menu) {

			case 1:
				AddNewBook.addbook();
				break;

			case 2:
				Change_Book.changebook();
				break;

			case 3:
				Find_Book.findbook();
				break;

			case 4:
				Remove_Book.removebook();
				break;

			case 5:
				BorrowBook.borrowbook();
				break;

			case 6:
				ReturnBook.returnbook();
				break;

			case 7:
				ClearBookmap.clearbookmap();
				break;
			case 8:
				ShowAll.showall();

			}

		}

	}

}