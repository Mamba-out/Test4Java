package com.henry.book_online;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class ShowAll {
	
	public static void  showall() {
		
		//判断存放图书信息的映射Map是否为空
		if(Add_Newbook.bookmap==null | Add_Newbook.bookmap.isEmpty()) {
			System.out.println("暂无图书信息");
		}
		
		//使用迭代器遍历输出映射中的元素
		Iterator<Map.Entry<String,Book_Father>> it=Add_Newbook.bookmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Book_Father>entry=it.next();
			System.out.println(entry.getValue().toString());
		}
	}
}
