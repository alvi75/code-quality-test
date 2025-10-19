import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (index < 0 || index >= buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        return buffer[index].available();
    }
}