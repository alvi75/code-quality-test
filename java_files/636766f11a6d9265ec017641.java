import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (this.index < 0 || this.limit <= this.index) {
            return -1;
        }
        return this.limit - this.index;
    }
}