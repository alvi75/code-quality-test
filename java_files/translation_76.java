import java.util.*;

public class Translation76 {
    ublic void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final long byte0 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = byte0 >>> 2;
        final long byte1 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4);
        final long byte2 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte1 & 15) << 2) | (byte2 >>> 6);
        values[valuesOffset++] = byte2 & 63;
    }
}
}