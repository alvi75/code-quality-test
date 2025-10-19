import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (closed) {
            throw new IOException("Stream closed");
        }
        return (int) (this.fileSize - this.position);
    }
}