import java.util.*;

public class Translation836 {
    public void decode(final byte[] blocks, final int blocksOffset, final int[] values, final int valuesOffset, final int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final int byte0 = blocks[blocksOffset++] & 0xFF;
        final int byte1 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = (byte0 << 4) | ((int)((long)(byte1 >>> 4)));
        final int byte2 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte1 & 15) << 8) | byte2;
    }
}
}