import java.sql.*;

public class Pract1{
    public static void main(String[] arg)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shruthidb","shruthi","abc@2");
        PreparedStatement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATE);
        ResultSet rs=st.executeQuery("select * from employee");
        rs.first();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
         rs.absolute(4);
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
        rs.previous();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

    }
}