import java.util.*;

public class Translation76 {
    ublic void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final int byte0 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = (long)((byte0 >>> 2));
        final int byte1 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte0 & 3) << 4) | ((long)((byte1 >>> 4)));
        final int byte2 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte1 & 15) << 2) | ((long)((byte2 >>> 6)));
        values[valuesOffset++] = (long)(byte2 & 63);
    }
}
}