
package Book;

import java.util.Scanner;

import Book.BookDB;
import Book.BookInfor;

	public class BookRegister 
	{
		private String bookTitle;
		private String isBorrowed="�뿩����";
		private final String NullLender ="����";
		private String bookLender=NullLender;
		private Scanner sc = new Scanner(System.in);

		public BookRegister()
		{
			System.out.println(" BOOK Register ");
			System.out.println("����� å ���� : ");
			bookTitle = sc.nextLine();		// å����
			
			BookInfor bookInfo = new BookInfor(bookTitle, isBorrowed, bookLender);	

			BookInfor.allBookList.add(bookInfo);		// ���ο� å ���
			
			System.out.println("���ο� å ����� �Ϸ� ");		// ���ο� å ��� �Ϸ� �޽���
		}
	}

