import java.util.*;

public class Translation261 {
    1 public void decode(int[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {
    2 for (int i = 0;
    i < iterations;
    ++i) {
        3 long block = blocks[blocksOffset++];
        4 for (int shift = 62;
        shift >= 0;
        shift -= 2) {
            5 values[valuesOffset++] = (int) ((block >>> shift) & 3);
            6 }
            7 }
        }
}