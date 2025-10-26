import java.util.*;

public class Translation759 {
    public synchronized void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, MessageFormat.format(JGitText.get().wrongDecompressedLength)));
    }
    int used = _enclosing.bAvail - inf.remainingInput;
    if (0 < used) {
        _enclosing.onObjectData(_src, buf, p, used);
        _enclosing.use(used);
    }
    inf.reset();
}
}