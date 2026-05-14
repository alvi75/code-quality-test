import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (remaining > 0 && !eof) {
        throw new EOFException();
    }
    read(src, skipBuffer);
    if (actualSize != expectedSize)throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected,JGitText.get().wrongCompressedLength));
    final int used = src.read(skipBuffer);
    if (0 < used) {
        onObjectData(src, buf, p, used);
        use(used);
    }
    inf.reset();
    remaining = 0;
    src.close();
}
}