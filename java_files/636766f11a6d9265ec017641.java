import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (this.buffer == null) {
            return 0;
        }
        return this.buffer.length - this.bufferPosition + super.available();
    }
}