import java.util.*;

public class Translation523 {
    public void flush() throws IOException {
    if (this.isClosed()) {
        return;
    }
    this.checkNotClosing();
    this.currentBuffer = null;
    this.bufferCount = 0;
}
}