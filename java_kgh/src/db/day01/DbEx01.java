import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbEx01{
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student" ;
		String id = "root";
		String pw = "root";
		
		Connection con = null;
		try{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,id,pw);
			 } catch (SQLException e){
			 System.out.println ("연결실패");
			 } catch (ClassNotFoundException e){
			 System.out.println("드라이버를 찾을 수 없습니다.");
			 }
		
		
	}

}