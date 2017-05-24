package Members;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

//import Constants.Constants;
import Members.MembersInfor;

public class MembersDB {
	private static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/bookr";
	private static final String username="woojin";
	private static final String password="1234";
	private static MembersDB MembersDB = new MembersDB();
	
	public static MembersDB getMembersDB() {
		return MembersDB;
	}
	public static void setMembersDB(MembersDB membersDB) {
		MembersDB = membersDB;
	}
	public void loadDB()
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//Constants.allMemberList=new ArrayList<>();
		try{
			Class.forName(JDBC_DRIVER);
			conn=(Connection) DriverManager.getConnection(DB_URL,username,password);
			st=conn.createStatement();
			String membersQuery ="SELECT * From members";
			rs=st.executeQuery(membersQuery);
			while(rs.next())
			{
				MembersInfor membersinfo=new MembersInfor(rs.getString("membersID"), rs.getString("membersName"),rs.getString("membersPN"));
				membersinfo.allMemberList.add(membersinfo);
			}
			System.out.println("등폴 완료");
		}catch (Exception e){
			System.out.println(e);
		}finally{
			if(rs != null)try{rs.close();}catch(SQLException sqle){}
			if(st != null)try{st.close();}catch(SQLException sqle){}
			if(conn != null)try{conn.close();}catch(SQLException sqle){}
		}

	}
	public void saveDB(){
		Connection conn = null;
		Statement st = null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conn = (Connection) DriverManager.getConnection(DB_URL, username, password);
			st = conn.createStatement();
			String membersQuery1 = "DELETE FROM members";
			String membersQuery2 = null;
		

			st.executeUpdate(membersQuery1);
			
			for(int i=0; i<MembersInfor.allMemberList.size(); i++){
				membersQuery2="INSERT INTO members VALUES('"+MembersInfor.allMemberList.get(i).getMemberId()+"','"+MembersInfor.allMemberList.get(i).getMemberName()+"','"+MembersInfor.allMemberList.get(i).getMemberPhoneNum()+"')";
				st.executeUpdate(membersQuery2);
			}
			
			
			System.out.println("save 완료");
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println("save 실패");
			
		}finally{
			if(st != null)try{st.close();}catch(SQLException sqle){}
			if(conn != null)try{conn.close();}catch(SQLException sqle){}
		}
	}
	
}
