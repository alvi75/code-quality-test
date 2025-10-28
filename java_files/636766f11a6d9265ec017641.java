import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    /**
     * Check the available space of this InputStream according to the index.
     **/
    @Override
    public int available() throws IOException {
        if (this.index < 0) {
            return -1;
        }
        if (this.index >= this.availableBytes) {
            return 0;
        }
        return this.availableBytes - this.index;
    }
}