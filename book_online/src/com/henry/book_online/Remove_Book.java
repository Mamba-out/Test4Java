package com.henry.book_online;

import java.util.Scanner;
import java.util.Set;

public class Remove_Book {
	public static void removebook() {
				//�жϴ��ͼ����Ϣ��ӳ��Map�Ƿ�Ϊ��,Ϊ�����޷�ɾ��
				if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
					System.out.println("����ͼ����Ϣ,�޷�ɾ��");
				}
				else {
					 ShowAll.showall();
					 Scanner sc = new Scanner(System.in);
					 System.out.println("������Ҫ�h����������");
					 String bookname= sc.next();
					 
					 boolean have=removebooknamehave(bookname);
					 if(have) {
						 Add_Newbook.bookmap.remove(bookname);
						 System.out.println("ɾ���ɹ���");
						 ShowAll.showall();
					 }
					 else {
						 System.out.println("�������ͼ�鲻���ڣ���Чɾ��");
					 }
					
				}
				
				
	}
	
	public static boolean removebooknamehave (String bookname) {
		 
		String newbookname=bookname;
	
		boolean have=false;	 
		//��ȡ���е�key
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
