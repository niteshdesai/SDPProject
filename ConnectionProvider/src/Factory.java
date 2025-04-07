
public class Factory {
  public static DatabaseConnection getconnection(int choice)
  {
    DatabaseConnection obj=null;

    switch (choice) {
        case 1:obj=new Mysqlconnect();
            
            break;
        case 2:obj=new postgresql();
            
            break;
        case 3:obj=new sqliteconnection();
            
            break;
    
        case 4:obj=new mssqlconnection();
            
            break;
    
        default:
            break;
    }
  return obj;
  }  
}
