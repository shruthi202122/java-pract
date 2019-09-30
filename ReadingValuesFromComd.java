import java.sql.*;
import java.io.*;

public class ReadingValuesFromComd{
    public static void main(String[] ar)throws SQLException,IOException,ClassNotFoundException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter drivername : ");
        String driver=br.readLine();
        System.out.print("Enter url : ");
        String url=br.readLine();
        System.out.print("Enter uname : ");
        String uname=br.readLine();
        System.out.print("Enter password : ");
        String pwd=br.readLine();

        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,uname,pwd);
        Statement st=connection.createStatement();
        st.executeUpdate("insert into employee values(5,'bnbn',8000)");
        connection.close();

    }
}