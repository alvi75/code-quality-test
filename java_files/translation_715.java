import java.util.*;

public class Translation715 {
    public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {
    for (int j = 0;
    j < iterations;
    ++j) {
        final byte block = blocks[blocksOffset++];
        values[valuesOffset++] = ((block >>> 7) & 1) | ((block >>> 6) & 2) | ((block >>> 5) & 4) | ((block >>> 4) & 8) | ((block >>> 3) & 16) | ((block >>> 2) & 32) | ((block >>> 1) & 64);
    }
}
}