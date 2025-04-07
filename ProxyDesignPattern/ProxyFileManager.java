
public class ProxyFileManager implements iFileManager{
    

     String role;
     FileManager fm=new FileManager();
     public ProxyFileManager(String role)
     {
             this.role=role;
     }
    @Override
    public void createFile(String path,String filename) {
        if(role.equalsIgnoreCase("Admin"))
        {
            fm.createFile(path,filename);
        }
        else
        {
            System.out.println("You can not Create a File");
        }
    }

    @Override
    public void createFolder(String dirname) {
        if(role.equalsIgnoreCase("Admin"))
        {
            fm.createFolder(dirname);
        }
        else
        {
            System.out.println("You can not Create a Folder");
        }
    }

    @Override
    public void deleteFile(String path,String filename) {
        if(role.equalsIgnoreCase("Admin"))
        {
            fm.deleteFile(path,filename);
        }
        else
        {
            System.out.println("You can not Delete a File");
        }
        
    }

    @Override
    public void deleteFolder(String dirname) {
        if(role.equalsIgnoreCase("Admin"))
        {
            fm.deleteFolder(dirname);
        }
        else
        {
            System.out.println("You can not Delete a Folder");
        }
        
    }

    @Override
    public void readFile(String path,String filename) {
            fm.readFile(path,filename);
    }

    @Override
    public void writeFile(String path,String filename,String data) {
        if(role.equalsIgnoreCase("Admin"))
        {

            fm.writeFile(path,filename,data);
        }
        else
        {
            System.out.println("You can not Write in File");
        }
        
    }

  
}

