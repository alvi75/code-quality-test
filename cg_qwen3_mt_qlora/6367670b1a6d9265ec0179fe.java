import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    /**Write the given byte array b into the output stream that this class represents.**/
    @Override
    public void write(byte b[]) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        }
        if (b.length > 0) {
            write(b, 0, b.length);
        }
    }
}