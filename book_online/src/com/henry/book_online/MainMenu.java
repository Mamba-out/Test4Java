package com.henry.book_online;

import java.util.Scanner;

public class MainMenu{
	
	 public static int  menu(){
		System.out.println("  BookStore Online  ");
		System.out.println("--------------------");
		System.out.println("0���˳���ϵͳ");
		System.out.println("1�����");
		System.out.println("2���޸�");
		System.out.println("3������");
		System.out.println("4��ɾ��");
		System.out.println("5������");
		System.out.println("6������");
		System.out.println("7����ʼ������");
		System.out.println("8���鿴ͼ����Ϣ");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("��ѡ��Ҫ���еĲ�����");
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
