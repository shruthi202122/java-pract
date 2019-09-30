import java.sql.*;
import java.io.*;
import java.util.*;

public class ReadingDataFromPropertiesFile{
    public static void main(String[] ar)throws SQLException,IOException,ClassNotFoundException{
        FileInputStream fis=new FileInputStream("dbinfo.properties");
        Properties pr=new Properties();
        pr.load(fis);
        System.out.print("Enter drivername : ");
        String driver=pr.getProperty("driver");
        System.out.print("Enter url : ");
        String url=pr.getProperty("url");
        System.out.print("Enter uname : ");
        String uname=pr.getProperty("uname");
        System.out.print("Enter password : ");
        String pwd=pr.getProperty("pwd");

        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,uname,pwd);
        Statement st=connection.createStatement();
        st.executeUpdate("insert into employee values(6,'dddd',10000)");
        connection.close();

    }
}