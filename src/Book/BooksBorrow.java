package Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Book.BookInfor;
import Members.MembersInfor;

public class BooksBorrow {
	private Scanner sc = new Scanner(System.in);
	private int borrowBookIdx;
	private int allBookNum;
	
	private String borrowBookTitle;
	private String lenderId;
	public static Map<String, String> borrowBookList = new HashMap<String, String>(); //key  value 
	
	public BooksBorrow()
	{
		System.out.println(" BOOK �뿩 ");
		System.out.println("�뿩�� id �Է� : ");
		lenderId = sc.nextLine();
		if(MembersInfor.isRegistId(lenderId))		
		{
			System.out.println("��ϵ� ����ڳ׿�!");		// ��ϵ� ����� �˸� �޽��� 
		}
		else 
		{
			System.out.println("��ϵ��� ���� ����� �Դϴ�! \n ȸ�������� ���� �ϼ���");	// ��ϵ��� ���� ����� �˸� �޽���
			return;
		}
		
		
		new BooksAllShow();
		System.out.println("���� å ��ȣ : ");
		try
		{
			borrowBookIdx = sc.nextInt()-1;					// �뿩�Ϸ��� å ��� ��ȣ
			allBookNum = BookInfor.allBookList.size();		// ���� ��ϵ� å�� �� �Ǽ�
		} catch(Exception e) { System.out.println("���� å�� Index�� �Է��ϼ���."); }
		
		if(allBookNum <= borrowBookIdx)
		{
			System.out.println("�������� �ʴ� ��ȣ �Դϴ�");		// �������� �ʴ� ��Ϲ�ȣ �޽���
			return;
		}
		else if(BookInfor.allBookList.get(borrowBookIdx).getIsBorrowed().equals("�뿩�Ұ�"))
		{
			System.out.println("�뿩���̿��� �̹�");			// �ش� å �뿩 �� �޽���
			return;
		}
		else 												// �ش� å �뿩 ���� & �뿩 ������ ����� ���
		{
			try 
			{
				borrowBookTitle = BookInfor.allBookList.get(borrowBookIdx).getBookTitle();		// �뿩�Ϸ��� å ����
				BookInfor.allBookList.get(borrowBookIdx).setBookLender(lenderId);				// å ������ �뿩�� �̸� ����
				BookInfor.allBookList.get(borrowBookIdx).setIsBorrowed("�뿩�Ұ�");						// å �뿩�� ǥ��
				//BookInfor.allBookList.get(borrowBookIdx).setBookLender(lenderId);
				borrowBookList.put(borrowBookTitle, lenderId);						// (key:å����, value:�뿩��)
			} catch(Exception e) 
			{
				System.out.println("�������� �ʴ� ��ȣ �Դϴ�.");		// �������� �ʴ� ��Ϲ�ȣ �޽���
				return;
			}
		}
		System.out.println("å �뿩 ����!");	// �뿩 �Ϸ� �޽���
	}

}
