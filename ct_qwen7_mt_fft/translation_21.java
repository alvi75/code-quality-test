import java.util.*;

public class Translation21 {
    public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) {
    final int available = bufferLength - bufferPosition;
    if (len <= available) {
        if (len > 0) {
            System.arraycopy(buffer, bufferPosition, b, offset, len);
        }
        bufferPosition += len;
    }
    else if (useBuffer) {
        if (buffer != null) {
            System.arraycopy(buffer, bufferPosition, b, offset, available);
        }
        final int left = len - available;
        if (left > blockSize) {
            refillBlock(false);
            System.arraycopy(block, 0, b, offset + available, blockSize);
            System.arraycopy(block, blockSize, b, offset + blockSize, left - blockSize);
        }
        else {
            block.refill(left);
            System.arraycopy(block.buffer, 0, b, offset + available, left);
        }
        buffer = block.buffer;
        bufferStart += bufferPosition;
        bufferPosition = 0;
        bufferLength = blockSize;
    }
    else {
        final long after = bufferStart + bufferPosition + len;
        if (after > length()) {
            throw new EOFException("read past end of stream: "+this);
        }
        fill(length()-after+1);
        if (buffer == null || buffer.length < len) {
            buffer = IOUtils.grow(buffer, len*2);
            bufferStart = origin;
        }
        System.arraycopy(buffer, bufferPosition, b, offset, len);
        bufferPosition += len;
    }
}
}