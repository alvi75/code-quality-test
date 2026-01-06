import java.util.*;

public class Translation309 {
    public void decode(final byte[] blocks, final int blocksOffset, final int[] values, final int valuesOffset, final int iterations) {
    assert bitsPerValue <= 32;
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = readInt64(blocks, blocksOffset);
        blocksOffset += 8;
        valuesOffset = decode(block, values, valuesOffset);
    }
}
}