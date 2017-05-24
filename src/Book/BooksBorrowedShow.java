package Book;
import java.util.Iterator;

import Book.BooksBorrow;;



public class BooksBorrowedShow {


	public BooksBorrowedShow() 
	{
		System.out.println(" 대여중인 책 LIST ");

		for(int i=0; i<BookInfor.allBookList.size();i++)
		{
			if(BookInfor.allBookList.get(i).getIsBorrowed().equals("대여불가"))
			{
			System.out.println(""+(i+1)+","+BookInfor.allBookList.get(i).getBookTitle()+"  "+BookInfor.allBookList.get(i).getBookLender());
		
			}
		}
		

	}


}
