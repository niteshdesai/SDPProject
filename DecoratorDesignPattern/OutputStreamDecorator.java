import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDecorator  extends OutputStream {
    private final OutputStream wrapped;

    public OutputStreamDecorator(OutputStream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println("Writing byte: " + b);
        wrapped.write(b);
    }

    @Override
    public void close() throws IOException {
        wrapped.close();
    }
}
