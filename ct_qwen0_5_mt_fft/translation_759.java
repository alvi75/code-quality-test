import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (this.read(this.skipBuffer) != -1 || this.actualSize != this.expectedSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    }
    final long used = this.size - this.offset;
    assert used >= 0;
    assert used <= this.size;
    this.offset += used;
    this.expectedSize -= used;
    this.actualSize -= used;
    this.in.reset();
}
}