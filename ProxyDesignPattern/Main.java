
public class Main {
    public static void main(String[] args) {
        iFileManager fm;
        System.out.println("Proxy -------------------------------");
        //proxy
        fm=new ProxyFileManager("admin");
        fm.createFolder("hello");
        fm.createFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");
       
        // fm.deleteFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");
        // fm.deleteFolder("hello");
        
        fm.writeFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt", "hello this is data new ");
        fm.readFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");

        fm=new ProxyFileManager("user");
        
        fm.createFolder("hello");
        fm.createFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");
       
        // fm.deleteFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");
        // fm.deleteFolder("hello");
        
        fm.writeFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt", "hello this is data new ");
        fm.readFile("C:/Users/pc/Desktop/SDPProject/hello/","kemcho.txt");


     
    }
}
