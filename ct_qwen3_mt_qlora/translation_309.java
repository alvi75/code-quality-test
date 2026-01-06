import java.util.*;

public class Translation309 {
    ublic void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
    assert bitsPerValue <= 64;
    if (bitsPerValue == 64) {
        decodeLong(blocks, blocksOffset, values, valuesOffset, iterations);
    }
    else {
        decodeInt(blocks, blocksOffset, values, valuesOffset, iterations);
    }
}
}