import java.util.*;

public class Translation317 {
    public void decode(final long[] blocks, final int blocksOffset, final int[] values, final int valuesOffset, final int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = blocks[blocksOffset++];
        for (int shift = 48;
        shift >= 0;
        shift -= 16) {
            values[valuesOffset++] = (int) ((block >>> shift) & 65535);
        }
    }
}
}