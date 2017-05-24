package Members;
import java.util.Scanner;

import Book.BooksBorrow;
import Book.BooksReturn;
import Members.MembersInfor;

public class MembersWithDraw {

	private String membersId;
	private String memberPw;
	private String lenderId;
	private String returnBookTitle;

	public MembersWithDraw()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("���̵� �Է� : ");
			membersId=sc.nextLine();	
			if(!MembersInfor.isRegistId(membersId) )
			{
				System.out.println("���� ���̵� �Դϴ� �ٽ� �Է��ϼ��� : ");
			}

			else if(BooksBorrow.borrowBookList.containsValue(membersId))	// �ݳ��Ϸ��� ����� ���� �ش�å�� �ݳ��� ����� ��ġ�ϸ�
			{
				System.out.println("�ݳ��� ���� ���ּ��� ");	
				break;
			}
			
			else
			{
				System.out.print("��й�ȣ�Է� : ");
				memberPw=sc.nextLine();
				for(int i=0 ; i<MembersInfor.allMemberList.size();i++)
				{
					if(MembersInfor.allMemberList.get(i).getMemberId().equals(this.membersId))
					{
						MembersInfor.allMemberList.remove(i);
					}
				}
				System.out.println("ȸ�� Ż�� �Ϸ� ");

				break;				
			}
		}


	}
}
