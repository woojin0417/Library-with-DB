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
		System.out.println(" BOOK �ݳ� ");
		System.out.println("id �Է�");
		bookBorrower = sc.nextLine();		// �뿩�� �̸�
		System.out.println("�ݳ��� å ����");
		Iterator<String> keySet = BooksBorrow.borrowBookList.keySet().iterator();

		for (int i = 0; i < BookInfor.allBookList.size(); i++) 
		{
			if(!BookInfor.allBookList.get(i).getBookLender().equals("����"))
			{
				System.out.println(""+(i+1)+ "," + BookInfor.allBookList.get(i).getBookTitle());
			}
			/*bookTitle = keySet.next();
			System.out.println("" + (i+1) + ". " + bookTitle);
			bookList.add(bookTitle);*/
		}
		System.out.print("å ���� : ");
		try 
		{
			selectNum = (sc.nextInt() - 1);
			if( selectNum > BookInfor.allBookList.size() ) 
			{
				System.out.println("�߸� ���� �߾��");		// ����Ʈ�� ���� index ����
				return;
			} 
			else		// �ݳ� ����
			{
				//retrunBookTitle = bookList.get(selectNum);
				if(bookBorrower.equals(BookInfor.allBookList.get(selectNum).getBookLender()))	// �ݳ��Ϸ��� ����� ���� �ش�å�� �ݳ��� ����� ��ġ�ϸ�
				{
					//BooksBorrow.borrowBookList.remove(retrunBookTitle);
					for (int i = 0; i < BookInfor.allBookList.size(); i++) 
					{
						if(i==selectNum)
						{
							BookInfor.allBookList.get(i).setIsBorrowed("�뿩����");
							BookInfor.allBookList.get(i).setBookLender("����");
						}
					}
					System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�");
				}
				else 
				{
					System.out.println("�ش�å�� ���� ����� �ƴϿ���");		// �ݳ��Ϸ��� å�� �뿩�ڰ� �ƴϾ �ݳ� �Ұ�
					return;
				}
			}
		} 
		catch(Exception e) { System.out.println("������ ������ å�� �ε����� �Է��ϼ���"); return; }		// ���ڰ� �ƴ� �� �Է����� ��
	}
}

