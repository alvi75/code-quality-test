import java.util.*;

public class Translation516 {
    public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
    for (int j = 0;
    j < iterations;
    ++j) {
        final byte block = blocks[blocksOffset++];
        values[valuesOffset++] = (block >>> 7) & 1;
        values[valuesOffset++] = (block >>> 6) & 1;
        values[valuesOffset++] = (block >>> 5) & 1;
        values[valuesOffset++] = (block >>> 4) & 1;
        values[valuesOffset++] = (block >>> 3) & 1;
        values[valuesOffset++] = (block >>> 2) & 1;
        values[valuesOffset++] = (block >>> 1) & 1;
        values[valuesOffset++] = block & 1;
    }
}
}