package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class BorrowBook {
	public static void borrowbook() {
		//�жϴ��ͼ����Ϣ��ӳ��Map�Ƿ�Ϊ��
		if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("����ͼ����Ϣ,�޷�����");
			}
		else {
			ShowAll.showall();
			borrow(usefulborrowbookname());
			
			ShowAll.showall();
		}
		
	}
	
	public static String borrowbookname() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("������Ҫ���ĵ�������");
		 String borrowbookname= sc.next();
		 return borrowbookname;
	}
	
	public static String usefulborrowbookname() {
		
		
		while(true) {
			 String newbookname=borrowbookname();
		//��ȡ���е�key
        Set<String> keys = Add_Newbook.bookmap.keySet();
        for(String key: keys){
            if(newbookname.equals(key)) {
            	  return newbookname;
            	}
           
        	}
		 }
	}
	
	public static void borrow (String bookname) {
		String borrowbookname=bookname;
		int number=Add_Newbook.bookmap.get(borrowbookname).booknumber;
		if(number==1) {
			System.out.println("�������һ�����ݲ�֧�ֽ���");
		}
		else {
			Add_Newbook.bookmap.get(borrowbookname).booknumber=number-1;
			System.out.println("���ĳɹ�");
		}
	}
	
}
