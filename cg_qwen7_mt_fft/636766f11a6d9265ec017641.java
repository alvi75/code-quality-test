import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (index >= size) return 0;
        else if (end == -1)
            return buffer.length - index;
        else return end - index;
    }
}