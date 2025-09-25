import java.util.*;

public class Translation261 {
    public void decode(final long[] blocks, final int blocksOffset, final int[] values, final int valuesOffset, final int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = blocks[blocksOffset++];
        for (int shift = 62;
        shift >= 0;
        shift -= 2) {
            values[valuesOffset++] = (int) ((block >>> shift) & 3L);
        }
    }
}
}