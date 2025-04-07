

import java.sql.*;
public interface DatabaseConnection {
    public Connection connect();
    public void executeQuery();
    public void disconnect();
} 
