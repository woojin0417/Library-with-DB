package Book;
import java.util.Iterator;

import Book.BooksBorrow;;



public class BooksBorrowedShow {


	public BooksBorrowedShow() 
	{
		System.out.println(" �뿩���� å LIST ");

		for(int i=0; i<BookInfor.allBookList.size();i++)
		{
			if(BookInfor.allBookList.get(i).getIsBorrowed().equals("�뿩�Ұ�"))
			{
			System.out.println(""+(i+1)+","+BookInfor.allBookList.get(i).getBookTitle()+"  "+BookInfor.allBookList.get(i).getBookLender());
		
			}
		}
		

	}


}
