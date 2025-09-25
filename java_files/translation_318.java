import java.util.*;

public class Translation318 {
    public long skip(final long charCount) throws IOException {
    if (charCount < 0) {
        throw new IllegalArgumentException("charCount < 0: " + charCount);
    }
    synchronized (lock) {
        checkNotClosed();
        if (charCount == 0) {
            return 0;
        }
        final int availableFromBuffer = buf.length - pos;
        if (availableFromBuffer > 0) {
            final long requiredFromIn = charCount - availableFromBuffer;
            if (requiredFromIn <= 0) {
                pos += (int)charCount;
                return charCount;
            }
            pos += availableFromBuffer;
            final long inSkipped = in.skip(requiredFromIn);
        }
        else {
            final long inSkipped = in.skip(charCount);
        }
        return inSkipped + availableFromBuffer;
    }
}
}