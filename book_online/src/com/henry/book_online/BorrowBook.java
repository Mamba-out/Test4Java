package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class BorrowBook {
	public static void borrowbook() {
		//判断存放图书信息的映射Map是否为空
		if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("暂无图书信息,无法借阅");
			}
		else {
			ShowAll.showall();
			borrow(usefulborrowbookname());
			
			ShowAll.showall();
		}
		
	}
	
	public static String borrowbookname() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("请输入要借阅的书名：");
		 String borrowbookname= sc.next();
		 return borrowbookname;
	}
	
	public static String usefulborrowbookname() {
		
		
		while(true) {
			 String newbookname=borrowbookname();
		//获取所有的key
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
			System.out.println("该书仅存一本，暂不支持借阅");
		}
		else {
			Add_Newbook.bookmap.get(borrowbookname).booknumber=number-1;
			System.out.println("借阅成功");
		}
	}
	
}
