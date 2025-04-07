import java.io.*;


public class DecoratorPattern {
    public static void main(String[] args) {
        try {
       
            System.out.println("Read a File");
            InputStreamDecorator inputStream = new InputStreamDecorator(new FileInputStream("DecoratorDesignPattern/input.txt"));
            while (inputStream.read() != -1);
            System.out.println("Character :"+inputStream.characterCount());
            System.out.println("Word :"+inputStream.wordCount());
            System.out.println("Line :"+inputStream.lineCount());
            inputStream.close();
            System.out.println("Write a File");
            OutputStream outputStream = new OutputStreamDecorator(new FileOutputStream("DecoratorDesignPattern/output.txt"));
            outputStream.write("Sample Output Data".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
