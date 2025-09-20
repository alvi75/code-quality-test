import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (read(readBuffer) != -1 || expectedSize != actualSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    }
    int used = buf.length - readBuffer.length;
    if (0 < used) {
        onObjectData(src, buf, p, used);
        use(used);
    }
    this.inf.reset();
}
}