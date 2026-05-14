import java.util.*;

public class Translation309 {
    1 public final void decode(byte[] blocks, int blocksOffset,int[] values, int valuesOffset,int iterations) {
    2 if (bitsPerValue > 32) {
        3 throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + "-bits values into an int[]");
        4 }
        5 for (int i = 0;
        i < iterations;
        ++i) {
            6 long block = readInt64(blocks, blocksOffset);
            7 blocksOffset += 8;
            8 valuesOffset = decode(block, values, valuesOffset);
            9 }
        }
}