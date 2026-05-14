import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    /**Check the available space of this InputStream according to the index.**/
    @Override public int available() throws IOException {
        if (this.index == this.end) {
            return 0;
        }
        return this.end - this.index;
    }
}