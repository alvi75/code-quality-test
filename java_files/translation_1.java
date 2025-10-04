import java.util.*;

public class Translation1 {
    public void addAll(BlockList<T> src) {
    if (src.isEmpty())return;
    if (size() == 0) {
        addAll(src);
    }
    int srcDirIdx = 0;
    for (;
    srcDirIdx < src.tailDirIdx;
    srcDirIdx++) {
        addAll(src.directory[srcDirIdx], 0, BLOCK_SIZE);
    }
    if (src.tailBlkIdx != 0) {
        addAll(src.tailBlock, 0, src.tailBlkIdx);
    }
}
}