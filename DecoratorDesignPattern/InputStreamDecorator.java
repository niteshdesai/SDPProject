import java.io.IOException;
import java.io.InputStream;

public class InputStreamDecorator extends InputStream{
     private final InputStream wrapped;
    private int charCount = 0, wordCount = 0, lineCount = 0;
    private boolean inWord = false;

    public InputStreamDecorator(InputStream wrapped) {
             this.wrapped = wrapped;
    }

    @Override
    public int read() throws IOException {
        int byteData = wrapped.read();
     
        char ch = (char) byteData;
        charCount++;
        if (ch == '\n') lineCount++;
        
        if (Character.isWhitespace(ch)) {
            inWord = false;
        } else if (!inWord) {
            wordCount++;
            inWord = true;
        }
        
      
        return byteData;
    }

    public int characterCount()
    {
        return charCount;
    }

    public int wordCount()
    {
        return wordCount;
    }

    public int lineCount()
    {
        return lineCount;
    } 
    
    @Override
    public void close() throws IOException {
        wrapped.close();
    }
}
