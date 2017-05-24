package Members;
import java.util.ArrayList;
import java.util.Scanner;

import Members.MembersInfor;

public class MembersRegi {

	
	private String memberName;
	private String memberPhoneNum;
	private String membersId;
	private String memberPw;
	private boolean temp = false;

	private Scanner sc = new Scanner(System.in);


	public MembersRegi()
	{
		/*Constants constants=new Constants();
		constants.allMemberList();*/
		//Constants.allMemberList=new ArrayList<>();
		
		System.out.println();
		System.out.println("SIGN UP");
		System.out.print("¾ÆÀÌµğ ÀÔ·Â : ");
		while(true)
		{
			membersId=sc.nextLine();	
			if(!MembersInfor.isRegistId(membersId) )
			{
				if(membersId.matches("^[a-z0-9_-]{3,16}$"))
				{
					break;
				}
				else
				{
					System.out.print("´Ù½Ã ¾ÆÀÌµğ ÀÔ·Â(¿µ¾î ¼Ò¹®ÀÚ¿Í ¼ıÀÚ·Î¸¸ Æ¯¼ö¹®ÀÚ _ , - Çã¿ë) : ");
				}

			}
			else 
			{
				System.out.print("´Ù½Ã ¾ÆÀÌµğ ÀÔ·Â(ÀÌ¹Ì ´©°¡ ¾²°í ÀÖ´Â id) : ");
			}
		}

		System.out.print("ÀÌ¸§ ÀÔ·Â : ");
		while(true)
		{
			memberName = sc.nextLine();			// »õ·Î¿î »ç¿ëÀÚ ÀÌ¸§
			if(memberName.matches("[°¡-ÆR]{2,6}"))
			{
				break;
			}
			else
			{
				System.out.print("´Ù½Ã ÀÌ¸§ ÀÔ·Â(ÇÑ±Û·Î¸¸ ÀÔ·Â °¡´É ) : ");
			}
		}

		System.out.print("ÀüÈ­¹øÈ£ ÀÔ·Â : ");

		while(true)
		{
			memberPhoneNum = sc.nextLine();	
			// »õ·Î¿î »ç¿ëÀÚ ÀüÈ­¹øÈ£
			if(memberPhoneNum.matches("01[016789]-(\\d{4})-(\\d{4})"))
			{
				break;
			}
			else
			{
				System.out.print("´Ù½Ã13ÀÚ¸®  ¹øÈ£ ÀÔ·Â : ");
			}

		}
		


		System.out.print("ºñ¹Ğ¹øÈ£ÀÔ·Â : ");
		while(true)
		{
			memberPw=sc.nextLine();
			if(memberPw.matches("^[a-z0-9_-]{3,16}$"))
			{
				break;
			}
			else
			{
				System.out.print("¿µ¾î ¼Ò¹®ÀÚ¿Í ¼ıÀÚ·Î¸¸ ´Ù½Ã ÀÔ·Â : ");
			}
		}
		

		MembersInfor memberInfo = new MembersInfor(membersId,memberName, memberPhoneNum);		// »ç¿ëÀÚ Á¤º¸ ´ãÀº Å¬·¡½º



		MembersInfor.allMemberList.add(memberInfo);								// »õ·Î¿î »ç¿ëÀÚ Á¤º¸ ÀúÀå

		System.out.println("»õ·Î¿î »ç¿ëÀÚ°¡ µî·Ï¿Ï·á!!");		// »õ·Î¿î È¸¿ø µî·Ï ¿Ï·á ¸Ş½ÃÁö


	}


}
