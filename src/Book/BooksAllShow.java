package Book;
import Book.BookInfor;

public class BooksAllShow {

	public String borrowInfo;
	
	public BooksAllShow()
	{
		System.out.println(" ���å LIST ");
		for (int i = 0; i < BookInfor.allBookList.size(); i++) 
		{/*
			if(BookInfor.allBookList.get(i).getIsBorrowed().equals("�뿩�Ұ�") )
			{
				borrowInfo = "(�뿩 �Ұ�)";		// �뿩���� 
			}
			else 
			{
				borrowInfo = "(�뿩����)";		// �뿩�Ұ�
			}*/
			System.out.println("" + (i+1) + ". " + BookInfor.allBookList.get(i).getBookTitle() + "("+BookInfor.allBookList.get(i).getIsBorrowed()+ ")"+ ". " + BookInfor.allBookList.get(i).getBookLender());
		}
		System.out.println("���å ��ȸ �Ϸ�");
	}
}
