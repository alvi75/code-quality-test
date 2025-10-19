import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (index == null) {
            return in.available();
        } else {
            long pos = index.getFilePointer();
            long end = index.getEndOfFilePointer();
            if (pos >= end) {
                return -1;
            }
            return (int) (end - pos);
        }
    }
}