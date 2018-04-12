package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class Remove_Book {
	public static void removebook() {
				//判断存放图书信息的映射Map是否为空,为空则无法删除
				if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
					System.out.println("暂无图书信息,无法删除");
				}
				else {
					 ShowAll.showall();
					 Scanner sc = new Scanner(System.in);
					 System.out.println("请输入要刪除的书名：");
					 String bookname= sc.next();
					 
					 boolean have=removebooknamehave(bookname);
					 if(have) {
						 Add_Newbook.bookmap.remove(bookname);
						 System.out.println("删除成功：");
						 ShowAll.showall();
					 }
					 else {
						 System.out.println("你输入的图书不存在，无效删除");
					 }
					
				}
				
				
	}
	
	public static boolean removebooknamehave (String bookname) {
		 
		String newbookname=bookname;
	
		boolean have=false;	 
		//获取所有的key
       Set<String> keys = Add_Newbook.bookmap.keySet();
       for(String key: keys){
           if(newbookname.equals(key)) {
           	  have=true;
           	  break;
           	}
          
       	}
       
       return have;
		
	}
}
