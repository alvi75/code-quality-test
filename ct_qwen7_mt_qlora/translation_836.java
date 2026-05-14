import java.util.*;

public class Translation836 {
    1 public void decode(byte[] blocks, int blocksOffset,int[] values, int valuesOffset,int iterations) {
    2 for (int i=0;
    i<iterations;
    ++i) {
        3 final int byte0 = blocks[blocksOffset++]&0xFF;
        4 final int byte1 = blocks[blocksOffset++]&0xFF;
        5 values[valuesOffset++] = (byte0<<4)|((byte1>>>4)&0xF);
        6 final int byte2 = blocks[blocksOffset++]&0xFF;
        7 values[valuesOffset++] = ((byte1&0xF)<<8)|byte2;
        8 }
    }
}