import java.util.*;

public class Translation76 {
    1 public void decode(byte[] blocks, int blocksOffset,int[] values, int valuesOffset,int iterations) {
    2 for (int i = 0;
    i < iterations;
    ++i) {
        3 final int byte0 = blocks[blocksOffset++];
        4 values[valuesOffset++] = (byte0 >>> 2) & 0xff;
        5 final int byte1 = blocks[blocksOffset++];
        6 values[valuesOffset++] = ((byte0 & 3) << 4) | ((byte1 >>> 4) & 0xf);
        7 final int byte2 = blocks[blocksOffset++];
        8 values[valuesOffset++] = ((byte1 & 15) << 2) | ((byte2 >>> 6) & 3);
        9 values[valuesOffset++] = byte2 & 63;
        10 }
    }
}