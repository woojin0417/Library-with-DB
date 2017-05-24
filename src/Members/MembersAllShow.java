package Members;

import Members.MembersInfor;

public class MembersAllShow {

	public MembersAllShow()
	{
		System.out.println();
		System.out.println(" 모든 회원 LIST ");				
		for (int i = 0; i < MembersInfor.allMemberList.size(); i++) 	// 각 Column에 해당하는 값
		{

			System.out.println(i+1+"\t\t"+ MembersInfor.allMemberList.get(i).getMemberId() + "\t\t" + MembersInfor.allMemberList.get(i).getMemberName()+"\t\t"+MembersInfor.allMemberList.get(i).getMemberPhoneNum() );
		}
		System.out.println("모든 회원 조회 완료");	
	}
}
