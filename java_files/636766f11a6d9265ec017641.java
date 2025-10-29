import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    /**Check the available space of this InputStream according to the index.**/
    @Override
    public int available() throws IOException {
        if (index < 0) {
            return -1;
        }
        if (index >= size) {
            return 0;
        }
        return size - index;
    }
}