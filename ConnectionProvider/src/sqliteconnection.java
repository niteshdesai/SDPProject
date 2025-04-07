import java.sql.*;


public class sqliteconnection implements DatabaseConnection {

    Connection con = null;

    public Connection connect() {

        try {

            con = DriverManager.getConnection("jdbc:sqlite:C:/Users/pc/Desktop/sqllitedb/mydb");
          
            if (con.isClosed()) {
                System.out.println("connection is not established");
            } else {
                System.out.println("Connected to SQLITE Database");
            }

       
        } catch (Exception e) {
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
            System.out.println("DisConnected to SQLITE Database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
