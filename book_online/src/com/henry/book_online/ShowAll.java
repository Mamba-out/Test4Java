package com.henry.book_online;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class ShowAll {
	
	public static void  showall() {
		
		//�жϴ��ͼ����Ϣ��ӳ��Map�Ƿ�Ϊ��
		if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("����ͼ����Ϣ");
		}
		
		//ʹ�õ������������ӳ���е�Ԫ��
		Iterator<Map.Entry<String,Book_Father>> it=Add_Newbook.bookmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Book_Father>entry=it.next();
			System.out.println(entry.getValue().toString());
		}
	}
}
