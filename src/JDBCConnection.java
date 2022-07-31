import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:sqlserver://laptop-6bnlh7jg\\sqlexpress;databaseName=students";
		String user = "sa";
		String password = "shri864827";
		String query = "Select * from students_details";
		
		
		Connection dbConnect = DriverManager.getConnection(url, user, password);
		Statement dbStatement = dbConnect.createStatement();
		ResultSet dbRS = dbStatement.executeQuery(query);
		System.out.println(dbRS);
		
		while(dbRS.next())
		{
			System.out.println(dbRS.getString(1));
			System.out.println(dbRS.getString(2));
			System.out.println(dbRS.getString(3));
		}
		
		
		
	}

}
