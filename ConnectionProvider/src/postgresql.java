import java.sql.*;

public class postgresql implements DatabaseConnection {
    Connection con = null;

    public Connection connect() {

        try {

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sms", "postgres", "root");

            if (con.isClosed()) {
                System.out.println("connection is not established");
            } else {
                System.out.println("Connected to POSTGRESQL Database");
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
            System.out.println("DisConnected to POSTGRESQL Database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
