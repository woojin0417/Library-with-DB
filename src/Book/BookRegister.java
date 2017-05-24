
package Book;

import java.util.Scanner;

import Book.BookDB;
import Book.BookInfor;

	public class BookRegister 
	{
		private String bookTitle;
		private String isBorrowed="대여가능";
		private final String NullLender ="없음";
		private String bookLender=NullLender;
		private Scanner sc = new Scanner(System.in);

		public BookRegister()
		{
			System.out.println(" BOOK Register ");
			System.out.println("등록할 책 제목 : ");
			bookTitle = sc.nextLine();		// 책제목
			
			BookInfor bookInfo = new BookInfor(bookTitle, isBorrowed, bookLender);	

			BookInfor.allBookList.add(bookInfo);		// 새로운 책 등록
			
			System.out.println("새로운 책 등록이 완료 ");		// 새로운 책 등록 완료 메시지
		}
	}

