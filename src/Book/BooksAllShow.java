package Book;
import Book.BookInfor;

public class BooksAllShow {

	public String borrowInfo;
	
	public BooksAllShow()
	{
		System.out.println(" 모든책 LIST ");
		for (int i = 0; i < BookInfor.allBookList.size(); i++) 
		{/*
			if(BookInfor.allBookList.get(i).getIsBorrowed().equals("대여불가") )
			{
				borrowInfo = "(대여 불가)";		// 대여가능 
			}
			else 
			{
				borrowInfo = "(대여가능)";		// 대여불가
			}*/
			System.out.println("" + (i+1) + ". " + BookInfor.allBookList.get(i).getBookTitle() + "("+BookInfor.allBookList.get(i).getIsBorrowed()+ ")"+ ". " + BookInfor.allBookList.get(i).getBookLender());
		}
		System.out.println("모든책 조회 완료");
	}
}
