import java.util.*;

public class Translation759 {
    ublic void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize)throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected,JGitText.get().wrongDecompressedLength));
    final int used = avail - inf.remainingInput;
    if (0 < used)inf.use(src, buf, p, used);
    inf.reset();
}
}