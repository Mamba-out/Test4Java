package com.henry.book_online;

import java.util.Scanner;

public class MainMenu{
	
	 public static int  menu(){
		System.out.println("  BookStore Online  ");
		System.out.println("--------------------");
		System.out.println("0、退出该系统");
		System.out.println("1、添加");
		System.out.println("2、修改");
		System.out.println("3、查找");
		System.out.println("4、删除");
		System.out.println("5、借书");
		System.out.println("6、还书");
		System.out.println("7、初始化程序");
		System.out.println("8、查看图书信息");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("请选择要进行的操作：");
        int menu = sc.nextInt(); 
		return menu;
		}
	 
	 
	 public static int usefulmenu() {
		 while(true) {
				int usefulmenu=menu();
				if(usefulmenu>=0 &usefulmenu <=8) {
				return usefulmenu;
				}
			}  
	 }
}
