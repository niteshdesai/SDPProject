import java.sql.*;



public class mssqlconnection implements DatabaseConnection

{
       Connection con = null;

    public Connection connect() {

        try {

            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sms;encrypt=true;trustServerCertificate=true","nitesh","root");

            if (con.isClosed()) {
                System.out.println("connection is not established");
            } else {
                System.out.println("Connected to MSSQL Database");
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {

                System.out.print(rs.getString("sname")+" ");

                System.out.print(rs.getInt("sem"));
                System.out.println();
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
            System.out.println("DisConnected to MSSQL Database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
