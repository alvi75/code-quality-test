import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    }
    int used = bAvail - inf.remainingInput;
    if (0 < used) {
        onObjectData(src, buf, p, used);
        use(used);
    }
    inf.reset();
}
}