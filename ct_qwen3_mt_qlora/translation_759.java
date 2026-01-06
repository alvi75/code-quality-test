import java.util.*;

public class Translation759 {
    234 public void close() throws IOException {
    if (read(skipBuffer) != -1 || actualSize != expectedSize)throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    int used = encloser.bAvail - inf.remainingInput;
    if (0 < used)encloser.onObjectData(src, buf, p, used);
    inf.reset();
}
}