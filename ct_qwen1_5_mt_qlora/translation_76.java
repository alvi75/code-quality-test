import java.util.*;

public class Translation76 {
    public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final int byte0 = blocks[blocksOffset++] & 0xff;
        values[valuesOffset++] = (byte0 >>> 2);
        final int byte1 = blocks[blocksOffset++] & 0xff;
        values[valuesOffset++] = (((byte0 & 3) << 4) | ((byte1 >>> 4)));
        final int byte2 = blocks[blocksOffset++] & 0xff;
        values[valuesOffset++] = (((byte1 & 15) << 2) | ((byte2 >>> 6)));
        values[valuesOffset++] = byte2 & 63;
    }
}
}