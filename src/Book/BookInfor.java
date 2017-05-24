package Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInfor {

	private final String NullLender ="없음"; 
	private String bookTitle;		// 책 제목
	private String bookLender=NullLender;		// 책 대여자 
	private String borrowDate;		// 책 대여일자	
	private String isBorrowed="대여가능";		// 책 대여 여부
	public static ArrayList<BookInfor> allBookList  = new ArrayList<BookInfor>();
	public BookInfor(String bookTitle ,String isBorrowed , String booklender)
	{
		this.bookTitle = bookTitle;
		//this.borrowDate= borrowDate;
		this.bookLender=booklender;
		this.isBorrowed = isBorrowed ;			// 책을 최초 등록할 때는 무조건 대여중이지 않다.
	}

	
	public String getIsBorrowed() {
		return isBorrowed;
	}



	public void setIsBorrowed(String isBorrowed) {
		this.isBorrowed = isBorrowed;
	}



	public String getBookTitle() 
	{
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}

	public String getBookLender() 
	{
		return bookLender;
	}

	public void setBookLender(String booklender) 
	{
		this.bookLender = booklender;
	}
/*
	public String getBorrowDate() 
	{
		return borrowDate;
	}

	public void setLendDate(String borrowDate) 
	{
		this.borrowDate = borrowDate;
	}
*/

}



