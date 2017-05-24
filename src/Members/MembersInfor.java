package Members;
import java.util.ArrayList;
import java.util.Scanner;


public class MembersInfor {
	
	private String memberName;			// 회원 이름
	private String memberPhoneNum;		// 회원 전화번호
	private String membersId;			// 회원 id
	private String memberPw;			// 회원 pW
	public static ArrayList<MembersInfor> allMemberList  = new ArrayList<MembersInfor>();	// 모든 회원 리스트
	public static boolean isRegistId(String membersId)
	{
		for (int i = 0; i < allMemberList.size(); i++) 
		{
			if(allMemberList.get(i).getMemberId().equals(membersId)) { return true; }
		}

		return false;
	}
	
	public MembersInfor(String membersId,String memberName, String phoneNum )/*String memberPw*/	
	{
		this.memberName = memberName;
		this.memberPhoneNum = phoneNum;
		this.membersId = membersId;
		this.memberPw= memberPw;
	}
	public String getMemberId() 
	{
		return membersId;
	}

	public void setMemberId(String membersId) 
	{
		this.membersId = membersId;
	}
	public String getMemberName() 
	{
		return memberName;
	}

	public void setMemberName(String memberName) 
	{
		this.memberName = memberName;
	}

	public String getMemberPhoneNum() 
	{
		return memberPhoneNum;
	}

	public void setMemberPhoneNum(String memberPhoneNum) 
	{
		this.memberPhoneNum = memberPhoneNum;
	}

	
	/*public String getmemberPw() 
	{
		return memberPw;
	}

	public void setmemberPw(String memberPw) 
	{
		this.memberPw = memberPw;
	}
*/
}

