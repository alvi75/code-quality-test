import java.util.*;

public class Translation14 {
    public synchronized boolean ready() throws IOException {
    if (in == null) {
        throw new IOException("InputStreamReader is closed");
    }
    boolean result = bytes.hasRemaining();
    if (!result && !in.ready()) {
        throw new EOFException(JGitText.get().unexpectedEndOfInput);
    }
    return result;
}
}