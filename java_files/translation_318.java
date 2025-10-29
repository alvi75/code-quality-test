import java.util.*;

public class Translation318 {
    public long skip(long charCount) throws IOException {
    if (charCount < 0) {
        throw new IllegalArgumentException("charCount < 0: " + charCount);
    }
    synchronized (lock) {
        checkNotClosed();
        if (charCount == 0) {
            return 0;
        }
        long inSkipped;
        int availableFromBuffer = buf.length - pos;
        if (availableFromBuffer > 0) {
            long requiredFromIn = charCount - availableFromBuffer;
            if (requiredFromIn <= 0) {
                pos += (int) (charCount);
                return charCount;
            }
            pos += availableFromBuffer;
            inSkipped = @in.skip(requiredFromIn);
        }
        else {
            inSkipped = @in.skip(charCount);
        }
        return inSkipped + availableFromBuffer;
    }
}
}