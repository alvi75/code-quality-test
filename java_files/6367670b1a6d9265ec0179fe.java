import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
    /**Write the given byte array b into the output stream that this class represents.**/
    public void write(byte b[]) throws IOException {
        if (b == null) throw new NullPointerException();
        int len = b.length;
        for (int i=0; i<len; ++i)
            write(b[i]);
    }
}