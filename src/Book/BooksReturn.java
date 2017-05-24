package Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import Constants.Constants;



public class BooksReturn 
{
	private Scanner sc = new Scanner(System.in);
	private String bookBorrower;
	private int selectNum;
	private ArrayList<String> bookList = new ArrayList<String>();
	public BooksReturn()
	{
		String bookTitle;
		String retrunBookTitle;
		System.out.println(" BOOK 반납 ");
		System.out.println("id 입력");
		bookBorrower = sc.nextLine();		// 대여자 이름
		System.out.println("반납할 책 선택");
		Iterator<String> keySet = BooksBorrow.borrowBookList.keySet().iterator();

		for (int i = 0; i < BookInfor.allBookList.size(); i++) 
		{
			if(!BookInfor.allBookList.get(i).getBookLender().equals("없음"))
			{
				System.out.println(""+(i+1)+ "," + BookInfor.allBookList.get(i).getBookTitle());
			}
			/*bookTitle = keySet.next();
			System.out.println("" + (i+1) + ". " + bookTitle);
			bookList.add(bookTitle);*/
		}
		System.out.print("책 선택 : ");
		try 
		{
			selectNum = (sc.nextInt() - 1);
			if( selectNum > BookInfor.allBookList.size() ) 
			{
				System.out.println("잘못 선택 했어요");		// 리스트에 없는 index 선택
				return;
			} 
			else		// 반납 가능
			{
				//retrunBookTitle = bookList.get(selectNum);
				if(bookBorrower.equals(BookInfor.allBookList.get(selectNum).getBookLender()))	// 반납하려는 사람과 실제 해당책을 반납한 사람이 일치하면
				{
					//BooksBorrow.borrowBookList.remove(retrunBookTitle);
					for (int i = 0; i < BookInfor.allBookList.size(); i++) 
					{
						if(i==selectNum)
						{
							BookInfor.allBookList.get(i).setIsBorrowed("대여가능");
							BookInfor.allBookList.get(i).setBookLender("없음");
						}
					}
					System.out.println("반납이 완료되었습니다");
				}
				else 
				{
					System.out.println("해당책을 빌린 사람이 아니에요");		// 반납하려는 책의 대여자가 아니어서 반납 불가
					return;
				}
			}
		} 
		catch(Exception e) { System.out.println("본인이 빌려간 책의 인덱스를 입력하세요"); return; }		// 숫자가 아닌 값 입력했을 때
	}
}

