package com.henry.book_online;

public class Book_Father {
	
	Book_Father(String bookername){
		this.bookname=bookername;
	}
	
	Book_Father(String bookname,String bookauthor,String bookpress,
			String booktime,int bookpages,int booknumber,float bookprice){
		this.bookname=bookname;
		this.bookauthor=bookauthor;
		this.bookpress=bookpress;
		this.booktime=booktime;
		this.bookpages=bookpages;
		this.booknumber=booknumber;
		this.bookprice=bookprice;
		
	}
	
	
	@Override
	public String toString() {
		return "书名：" + bookname + ", 作者：" + bookauthor + ", 出版社：" + bookpress
				+ ", 出版时间：" + booktime + ", 页数：" + bookpages + ", 库存数量：" + booknumber + ", 价格："
				+ bookprice;
	}


	public String bookname;
	public String bookauthor;
	public String bookpress;
	public String booktime;
	public int bookpages;
	public int booknumber;
	public float bookprice;
	
	
	
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookpress() {
		return bookpress;
	}

	public void setBookpress(String bookpress) {
		this.bookpress = bookpress;
	}

	public String getBooktime() {
		return booktime;
	}

	public void setBooktime(String booktime) {
		this.booktime = booktime;
	}

	public int getBookpages() {
		return bookpages;
	}

	public void setBookpages(int bookpages) {
		this.bookpages = bookpages;
	}

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}

	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	
	
	
}
