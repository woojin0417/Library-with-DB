package Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInfor {

	private final String NullLender ="����"; 
	private String bookTitle;		// å ����
	private String bookLender=NullLender;		// å �뿩�� 
	private String borrowDate;		// å �뿩����	
	private String isBorrowed="�뿩����";		// å �뿩 ����
	public static ArrayList<BookInfor> allBookList  = new ArrayList<BookInfor>();
	public BookInfor(String bookTitle ,String isBorrowed , String booklender)
	{
		this.bookTitle = bookTitle;
		//this.borrowDate= borrowDate;
		this.bookLender=booklender;
		this.isBorrowed = isBorrowed ;			// å�� ���� ����� ���� ������ �뿩������ �ʴ�.
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



