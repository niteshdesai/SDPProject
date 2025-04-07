import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager implements iFileManager{

    @Override
    public void createFolder(String dirname) {
     
      File f=new File((Paths.get("").toString()+dirname));
      if(f.isDirectory())
      {
           System.out.println("Folder is exist:");
      }
      else
      {
       f.mkdir();
       System.out.println("Create Folder");  
      }
    }
    @Override
    public void deleteFolder(String dirname) {
       

      File f=new File((Paths.get("").toString()+dirname));
      File t[]=f.listFiles();
    
      if(t.length==0)
      {
         f.deleteOnExit();
         System.out.println("folder is delete");

      }
      else
      {
         System.out.println("folder is not empty");
      }
     

      
    }
    @Override
    public void createFile(String path,String filename) {
      try {
         File f=new File(""+path+""+filename+"");
         if(f.createNewFile())
         {
                System.out.println("File is create ");
         }
          else
          {
                 System.out.println("File is exist");
          }
      } catch (Exception e) {
         System.out.println("File already exist");
      }
   
       
    }
    @Override
    public void deleteFile(String path,String filename) {
      File f=new File(""+path+""+filename+"");
      if(f.delete())
      {
          System.out.println("Delete file");
      }
      else
      {
         System.out.println("not Delete  file");
      }
    }
    @Override
    public void readFile(String path,String filename) {

        try {
         FileInputStream fd=new FileInputStream(""+path+""+filename+"");
          int c;
         while((c=fd.read())!=-1)
         {
            System.out.print((char)c);
         }
        System.out.println(" ");
         fd.close();
        } catch (Exception e) {
       
         e.printStackTrace();
        }
       
    }
    @Override
    public void writeFile(String path,String filename,String data) {

      try  {
          byte d[]=data.getBytes();
         FileOutputStream fs = new FileOutputStream(""+path+""+filename+"");
         fs.write(d);
         fs.close();
      } catch (Exception e) {
         
         e.printStackTrace();
      }

       System.out.println("Write File");
    }
}
