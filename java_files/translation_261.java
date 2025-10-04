import java.util.*;

public class Translation261 {
    public void decode(long[] blocks, int blocksOffset, int[] values,int valuesOffset, int iterations) {
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = blocks[blocksOffset++];
        for (int shift = 62;
        shift >= 0;
        shift -= 2) {
            values[valuesOffset++] = (int) ((block >>> shift) & 3);
        }
    }
}
}