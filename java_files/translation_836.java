import java.util.*;

public class Translationtranslation_836 {
    public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {
        for (int i = 0;
        i < iterations;
        ++i) {
            final long byte0 = blocks[blocksOffset++] & 0xFF;
            final long byte1 = blocks[blocksOffset++] & 0xFF;
            values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4);
            final long byte2 = blocks[blocksOffset++] & 0xFF;
            values[valuesOffset++] = ((byte1 & 15) << 8) | byte2;
        }
    }
    This method decodes a block of bytes (defined as blocks[0]) into a long integer (defined as values[0]). Each byte in the block is interpreted as a bit in a binary number, and the bits are concatenated to form the value being decoded.
}