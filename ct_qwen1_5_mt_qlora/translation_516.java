import java.util.*;

public class Translation516 {
    public void decode(final byte[] blocks, final int blocksOffset, final int[] values, final int valuesOffset, final int iterations) {
    for (int j = 0;
    j < iterations;
    ++j) {
        final int block = blocks[blocksOffset++];
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