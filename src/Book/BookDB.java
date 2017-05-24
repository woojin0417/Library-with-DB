package Book;

import java.sql.*;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

//import Constants.Constants;


public class BookDB {
	private static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/bookr";
	private static final String username="woojin";
	private static final String password="1234";
	private static BookDB BookDB = new BookDB();
	public static BookDB getBookDB() {
		return BookDB;
	}
	public static void setBookDB(BookDB bookDB) {
		BookDB = bookDB;
	}
	
	public void loadDB()
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//Constants.allBookList=new ArrayList<>();
		try{
			Class.forName(JDBC_DRIVER);
			conn=(Connection) DriverManager.getConnection(DB_URL,username,password);
			st=conn.createStatement();
			String bookQuery ="SELECT * From book";
			rs=st.executeQuery(bookQuery);
			while(rs.next())
			{
				BookInfor bookinfor=new BookInfor(rs.getString("bookName"), rs.getString("borrowStatus"), rs.getString("bookLender"));
				BookInfor.allBookList.add(bookinfor);
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
			String bookQuery1 = null;
			String bookQuery2 = "DELETE FROM book";

			st.executeUpdate(bookQuery2);
			
			for(int i=0; i<BookInfor.allBookList.size(); i++){
				bookQuery1="INSERT INTO book VALUES('"+BookInfor.allBookList.get(i).getBookTitle()+"','"+BookInfor.allBookList.get(i).getIsBorrowed()+"','"+BookInfor.allBookList.get(i).getBookLender()+"')";
				st.executeUpdate(bookQuery1);
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
	/*public void saveDB()
	{	
		Connection conn = null;
		Statement st = null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conn=(Connection) DriverManager.getConnection(DB_URL,username,password);
			st=conn.createStatement();
			String bookQuery =null;
			String[] buffer = null;
			bookQuery= "INSERT INTO book VALUES("+buffer[0]+")";
			st.executeUpdate(bookQuery);
			System.out.println("등폴 완료");
		}catch (Exception e){
			System.out.println(e);
		}finally{
			if(st != null)try{st.close();}catch(SQLException sqle){}
			if(conn != null)try{conn.close();}catch(SQLException sqle){}
		}
			
		
	}*/
	/*public static Connection getConnection()
	*/
}
