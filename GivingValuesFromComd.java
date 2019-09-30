import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GivingValuesFromComd {

	public static void main(String[] ar) throws ClassNotFoundException, SQLException {

		Class.forName(ar[0]);
		Connection connection=DriverManager.getConnection(ar[1],ar[2],ar[3]);
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into employee values(3,'abc',30000)");
		connection.close();
		
	}
 
}