import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationByJdbcDrivers {

	public static void main(String[] ar) throws ClassNotFoundException, SQLException {

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shruthidb","shruthi","abc@2");
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into employee values(4,'www',5000)");
		connection.close();
		
	}
 
}