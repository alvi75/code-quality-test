import java.util.*;

public class Translation715 {
    1 public void decode(byte[] blocks, int blocksOffset,int[] values, int valuesOffset,int iterations) {
    2 for (int j = 0;
    j < iterations;
    ++j) {
        3 byte block = blocks[blocksOffset++];
        4 values[valuesOffset++] = (byte) (((int) ((long) block >>> 7)) & 1);
        5 values[valuesOffset++] = (byte) (((int) ((long) block >>> 6)) & 1);
        6 values[valuesOffset++] = (byte) (((int) ((long) block >>> 5)) & 1);
        7 values[valuesOffset++] = (byte) (((int) ((long) block >>> 4)) & 1);
        8 values[valuesOffset++] = (byte) (((int) ((long) block >>> 3)) & 1);
        9 values[valuesOffset++] = (byte) (((int) ((long) block >>> 2)) & 1);
        10 values[valuesOffset++] = (byte) (((int) ((long) block >>> 1)) & 1);
        11 values[valuesOffset++] = (byte) (block & 1);
    }
    12 }
}