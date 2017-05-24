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
			System.out.println("   ====================================�������� ���α׷�=====================================");		
			System.out.println();
			System.out.println("   ========================================�޴�=========================================");
			System.out.println(" <<1.ȸ������, 2.���ȸ������, 3.å���, 4.��� å ����, 5.�뿩, 6.�뿩����Ʈ, 7.�ݳ�, 8.ȸ��Ż��  9. EXIT>> ");
			System.out.println("   ====================================================================================");

			br = new BufferedReader(new InputStreamReader(System.in));
			try 
			{
				System.out.print("�׸��� �����ϼ��� : ");
				selectMenuNum = br.readLine();		
				int numSelec = Integer.parseInt(selectMenuNum);		// String -> Integer ĳ����
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

					System.out.println("Exit BookManager");		// BookManager ���� �޽���
					System.exit(0);	
					break;		
				default : System.out.println("���� �޴��Դϴ�"); break;
				}
			}
			catch(IOException e) { e.printStackTrace(); }
			catch(NumberFormatException e) { System.out.println("���ڸ� �Է����ּ���!"); }		// ���ڰ� �ƴ� �� �Է����� ��
		}
	}

}

