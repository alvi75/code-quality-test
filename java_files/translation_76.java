import java.util.*;

public class Translation76 {
    ublic override void Decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations){
    for (int i = 0;
    i < iterations;
    ++i){
        int byte0 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = (byte)(((uint)byte0 >> 2) & 3);
        int byte1 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte)(((uint)byte1 >> 4) & 7)) | (((int)((uint)byte1 >> 6) & 6) << 4);
        int byte2 = blocks[blocksOffset++] & 0xFF;
        values[valuesOffset++] = ((byte)(((uint)byte2 >> 2) & 3)) | (((int)((uint)byte2 >> 6) & 7) << 6);
        values[valuesOffset++] = byte2 & 63;
    }
}
}