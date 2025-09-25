import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (this.read(skipBuffer) != -1 || this.actualSize != this.expectedSize)throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    final int used = this.avail - this.inf.remainingInput;
    if (0 < used) {
        this.enclosing.onObjectData(src, buf, p, used);
        this.enclosing.use(used);
    }
    this.inf.reset();
}
}