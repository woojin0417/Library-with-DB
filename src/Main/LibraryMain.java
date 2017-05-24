package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Book.BookDB;
import Book.BookRegister;
import Book.BooksAllShow;
import Book.BooksBorrow;
import Book.BooksBorrowedShow;
import Book.BooksReturn;
import Members.MembersAllShow;
import Members.MembersDB;
import Members.MembersRegi;
import Members.MembersWithDraw;


public class LibraryMain {	

	public static void main(String[] args) 
	{	
		new LibraryMain();
	}
	
	
	LibraryMain()
	{
		boolean temp = false;
		BufferedReader br;
		String selectMenuNum;
		BookDB bookdb=new BookDB();
		MembersDB membersdb=new MembersDB();
	
		
		membersdb.loadDB();
		bookdb.loadDB();

		while(!temp)
		{
			System.out.println("   ====================================도서관리 프로그램=====================================");		
			System.out.println();
			System.out.println("   ========================================메뉴=========================================");
			System.out.println(" <<1.회원가입, 2.모든회원보기, 3.책등록, 4.모든 책 보기, 5.대여, 6.대여리스트, 7.반납, 8.회원탈퇴  9. EXIT>> ");
			System.out.println("   ====================================================================================");

			br = new BufferedReader(new InputStreamReader(System.in));
			try 
			{
				System.out.print("항목을 선택하세요 : ");
				selectMenuNum = br.readLine();		
				int numSelec = Integer.parseInt(selectMenuNum);		// String -> Integer 캐스팅
				switch(numSelec)
				{
				case 1 : new MembersRegi(); break;
				case 2 : new MembersAllShow(); break;
				case 3 : new BookRegister(); break;
				case 4 : new BooksAllShow(); break;
				case 5 : new BooksBorrow(); break;
				case 6 : new BooksBorrowedShow(); break;
				case 7 : new BooksReturn(); break;
				case 8 : new MembersWithDraw(); break;
				case 9 : 					
					temp = true;
					bookdb.saveDB();
					membersdb.saveDB();

					System.out.println("Exit BookManager");		// BookManager 종료 메시지
					System.exit(0);	
					break;		
				default : System.out.println("없는 메뉴입니다"); break;
				}
			}
			catch(IOException e) { e.printStackTrace(); }
			catch(NumberFormatException e) { System.out.println("숫자를 입력해주세요!"); }		// 숫자가 아닌 값 입력했을 때
		}
	}

}

