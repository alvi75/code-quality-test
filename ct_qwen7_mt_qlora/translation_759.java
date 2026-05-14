import java.util.*;

public class Translation759 {
    234@Override public void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize)throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    final int used = src.available() - inf.getRemainingInput();
    if (0 < used)src.onRead(used);
    inf.reset();
}
}