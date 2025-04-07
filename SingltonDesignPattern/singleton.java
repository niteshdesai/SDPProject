

import java.sql.*;
class connection
{
   private static Connection con=null;

   private connection()
   {

   }
   public static Connection getconnection()
   {
       if(con==null)
       {
          synchronized(connection.class)
          { 
            try {
               Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root", "root");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch(ClassNotFoundException e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
          }
       }
       return con;
   }
}

public class singleton {
    public static void main(String[] args) {
        Connection con =connection.getconnection();

        System.out.println(con.hashCode());

        Connection con1=connection.getconnection();

        System.out.println(con1.hashCode());
   
    }

}
