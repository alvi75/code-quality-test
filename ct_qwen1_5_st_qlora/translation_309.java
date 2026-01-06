import java.util.*;

public class Translation309 {
    public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {
    assert bitsPerValue <= 32;
    if (bitsPerValue > 32) {
        throw new IllegalArgumentException("Cannot decode " + bitsPerValue + "-bit values into an int[]");
    }
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = readInt64(blocks, blocksOffset);
        blocksOffset += 8;
        valuesOffset = decode(block, values, valuesOffset);
    }
    return;
}
}