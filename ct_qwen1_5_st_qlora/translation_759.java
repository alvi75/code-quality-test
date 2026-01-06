import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    }
    final int used = bufAvail - inf.remaining();
    if (0 < used) {
        onObjectData(src, buf, p, used);
    }
    inf.reset();
}
}