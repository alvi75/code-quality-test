import java.util.*;

public class Translation836 {
    0;
for (int i = 0;
i < iterations;
++i) {
    int byte0 = blocks[blocksOffset++] & 0xFF;
    int byte1 = blocks[blocksOffset++] & 0xFF;
    values[valuesOffset++] = (byte0 << 4) | ((int)((long)byte1 >> 4));
    int byte2 = blocks[blocksOffset++] & 0xFF;
    values[valuesOffset++] = ((byte1 & 15) << 8) | byte2;
}
}