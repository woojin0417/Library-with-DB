package Members;

import Members.MembersInfor;

public class MembersAllShow {

	public MembersAllShow()
	{
		System.out.println();
		System.out.println(" ��� ȸ�� LIST ");				
		for (int i = 0; i < MembersInfor.allMemberList.size(); i++) 	// �� Column�� �ش��ϴ� ��
		{

			System.out.println(i+1+"\t\t"+ MembersInfor.allMemberList.get(i).getMemberId() + "\t\t" + MembersInfor.allMemberList.get(i).getMemberName()+"\t\t"+MembersInfor.allMemberList.get(i).getMemberPhoneNum() );
		}
		System.out.println("��� ȸ�� ��ȸ �Ϸ�");	
	}
}
