import java.util.*;

public class Translation76 {
    public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final int byte0 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = (int)(((byte0 >>> 2) & 3) << 24 | ((byte0 & 3) << 16) | ((byte1 >>> 4) & 63) << 8 | (byte2 >>> 0) & 255);
    }
}
}