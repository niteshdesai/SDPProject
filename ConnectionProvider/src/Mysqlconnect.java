
import java.sql.*;

public class Mysqlconnect implements DatabaseConnection {
    Connection con = null;

    public Connection connect() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root", "root");

            if (con.isClosed()) {
                System.out.println("connection is not established");
            } else {
                System.out.println("Connected to MYSQL Database");
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return con;
    }
    public void executeQuery()
    {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {

                System.out.print(rs.getString("sname")+"   ");
                
                System.out.print(rs.getInt("sem"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void disconnect() {
        try {
            con.close();
            System.out.println("DisConnected to MYSQL Database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}