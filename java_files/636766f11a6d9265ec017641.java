import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (index < 0) {
            return -1;
        }
        try {
            //if we have reached the end of the file, then there is no more data.
            if (index >= length) {
                throw new EOFException();
            }
            long pos = position;
            if (pos > 0 && pos <= index) {
                return pos - index;
            } else {
                return length - index;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}