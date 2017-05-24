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
		System.out.print("���̵� �Է� : ");
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
					System.out.print("�ٽ� ���̵� �Է�(���� �ҹ��ڿ� ���ڷθ� Ư������ _ , - ���) : ");
				}

			}
			else 
			{
				System.out.print("�ٽ� ���̵� �Է�(�̹� ���� ���� �ִ� id) : ");
			}
		}

		System.out.print("�̸� �Է� : ");
		while(true)
		{
			memberName = sc.nextLine();			// ���ο� ����� �̸�
			if(memberName.matches("[��-�R]{2,6}"))
			{
				break;
			}
			else
			{
				System.out.print("�ٽ� �̸� �Է�(�ѱ۷θ� �Է� ���� ) : ");
			}
		}

		System.out.print("��ȭ��ȣ �Է� : ");

		while(true)
		{
			memberPhoneNum = sc.nextLine();	
			// ���ο� ����� ��ȭ��ȣ
			if(memberPhoneNum.matches("01[016789]-(\\d{4})-(\\d{4})"))
			{
				break;
			}
			else
			{
				System.out.print("�ٽ�13�ڸ�  ��ȣ �Է� : ");
			}

		}
		


		System.out.print("��й�ȣ�Է� : ");
		while(true)
		{
			memberPw=sc.nextLine();
			if(memberPw.matches("^[a-z0-9_-]{3,16}$"))
			{
				break;
			}
			else
			{
				System.out.print("���� �ҹ��ڿ� ���ڷθ� �ٽ� �Է� : ");
			}
		}
		

		MembersInfor memberInfo = new MembersInfor(membersId,memberName, memberPhoneNum);		// ����� ���� ���� Ŭ����



		MembersInfor.allMemberList.add(memberInfo);								// ���ο� ����� ���� ����

		System.out.println("���ο� ����ڰ� ��ϿϷ�!!");		// ���ο� ȸ�� ��� �Ϸ� �޽���


	}


}
