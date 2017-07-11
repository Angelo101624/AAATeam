import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import javax.naming.spi.DirStateFactory.Result;

public class ConnectionMySQL {
	//public static void main(String [] args) {
	
	public ConnectionMySQL(){}
	
	public void cerca(){
		try {
			Connection conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/issi","root","");
			System.out.println("Database connesso");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from persone");
			while(rs.next()) {
				System.out.println(rs.getString("username"));
			}		} catch (Exception e) {
			System.err.println(e);
		}
	}
}