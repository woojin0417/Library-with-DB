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
			System.out.print("아이디 입력 : ");
			membersId=sc.nextLine();	
			if(!MembersInfor.isRegistId(membersId) )
			{
				System.out.println("없는 아이디 입니다 다시 입력하세요 : ");
			}

			else if(BooksBorrow.borrowBookList.containsValue(membersId))	// 반납하려는 사람과 실제 해당책을 반납한 사람이 일치하면
			{
				System.out.println("반납을 먼저 해주세요 ");	
				break;
			}
			
			else
			{
				System.out.print("비밀번호입력 : ");
				memberPw=sc.nextLine();
				for(int i=0 ; i<MembersInfor.allMemberList.size();i++)
				{
					if(MembersInfor.allMemberList.get(i).getMemberId().equals(this.membersId))
					{
						MembersInfor.allMemberList.remove(i);
					}
				}
				System.out.println("회원 탈퇴 완료 ");

				break;				
			}
		}


	}
}
