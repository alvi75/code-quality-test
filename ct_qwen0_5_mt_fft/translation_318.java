import java.util.*;

public class Translation318 {
    public long skip(long charCount) {
    if (charCount < 0) {
        throw new IllegalArgumentException("charCount < 0: " + charCount);
    }
    synchronized (lock) {
        checkNotClosed();
        if (charCount == 0) {
            return 0;
        }
        final long inSkipped;
        final int availableFromBuffer = buf.length - pos;
        if (availableFromBuffer > 0) {
            final long requiredFromIn = charCount - availableFromBuffer;
            if (requiredFromIn <= 0) {
                pos += (int) (charCount);
            }
            else {
                pos += availableFromBuffer;
            }
        }
        else {
            inSkipped = in.skip(charCount);
        }
        return inSkipped + availableFromBuffer;
    }
}
}