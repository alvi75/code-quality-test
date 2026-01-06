import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (this.read == -1 || this.skipBuffer.length != this.actualSize) {
        throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruptionDetected, JGitText.get().wrongDecompressedLength));
    }
    int used = this._enclosing.bAvail - this.inf.getRemainingInput();
    if (0 < used) {
        this._enclosing.onObjectData(this.src, this._enclosing.buf, this.p, used);
        this._enclosing.use(used);
    }
    this.inf.reset();
}
}