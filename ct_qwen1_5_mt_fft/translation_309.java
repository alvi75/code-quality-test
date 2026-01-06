import java.util.*;

public class Translation309 {
    public final void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
    assert bitsPerValue <= 32;
    if (bytesPerValue > 1) {
        for (int i = 0;
        i < iterations;
        ++i) {
            final long byte0 = blocks[blocksOffset++] & 0xFF;
            final long byte1 = blocks[blocksOffset++] & 0xFF;
            values[valuesOffset++] = (byte0 << 5) | (byte1 >>> 2);
            final long byte2 = blocks[blocksOffset++] & 0xFF;
            final long byte3 = blocks[blocksOffset++] & 0xFF;
            values[valuesOffset++] = ((byte1 & 3) << 12) | (byte2 << 3) | (byte3 >>> 5);
        }
    }
    else if (bytesPerValue == 1) {
        for (int i = 0;
        i < iterations;
        ++i) {
            final long byte0 = blocks[blocksOffset++] & 0xFF;
            values[valuesOffset++] = byte0 << 5;
        }
    }
}
}