import java.util.*;

public class Translation1 {
    public void addAll(BlockList<? extends T> src) {
    if (src.size() == 0)return;
    final int srcDirIdx = 0;
    for (int srcTailDirIdx = 0;
    srcTailDirIdx < src.tailDirIdx;
    ++srcTailDirIdx) {
        addAll(src.directory[srcTailDirIdx], 0, BLOCK_SIZE);
    }
    if (src.tailBlkIdx > 0) {
        addAll(src.tailBlock, 0, src.tailBlkIdx);
    }
}
}