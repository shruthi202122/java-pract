import java.sql.*;
import java.io.*;
import java.util.*;

public class UsingUserdefinedSystemProperties{
    public static void main(String[] ar)throws SQLException,IOException,ClassNotFoundException{
       
        String driver=System.getProperty("driver");
        String url=System.getProperty("url");
        String uname=System.getProperty("uname");
        String pwd=System.getProperty("pwd");

        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,uname,pwd);
        Statement st=connection.createStatement();
        st.executeUpdate("insert into employee values(7,'jkl',60000)");
        connection.close();

    }
}