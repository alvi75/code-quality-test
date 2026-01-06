import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    /**Check the available space of this InputStream according to the index.**/
    public int available() throws IOException {
        if (index >= 0 && index < data.length) {
            return data[index].length;
        }
        else {
            return -1;
        }
    }
}