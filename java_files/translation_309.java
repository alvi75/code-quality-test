import java.util.*;

public class Translation309 {
    1 for (int i = 0;
i < iterations;
++i) {
    long block = readInt64(blocks, blocksOffset);
    blocksOffset += 8;
    valuesOffset = decode(block, values, valuesOffset);
}
}
}