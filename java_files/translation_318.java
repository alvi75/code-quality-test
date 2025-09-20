import java.util.*;

public class Translation318 {
    public final long skip(long charCount) throws IOException {
    synchronized (lock) {
        checkNotClosed();
        if (charCount < 0) {
            throw new IllegalArgumentException("charCount < 0: " + charCount);
        }
        final long inSkipped;
        final int availableFromBuffer = buf.length - pos;
        if (availableFromBuffer > 0) {
            final long requiredFromIn = charCount - availableFromBuffer;
            if (requiredFromIn <= 0) {
                pos += (int)charCount;
                return charCount;
            }
            pos += availableFromBuffer;
            inSkipped = in.skip(requiredFromIn);
        }
        else {
            inSkipped = in.skip(charCount);
        }
        return inSkipped + availableFromBuffer;
    }
}
}