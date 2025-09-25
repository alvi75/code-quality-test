import java.util.*;

public class Translation1 {
    public void addAll(BlockList<E> src) {
    if (src.size() == 0)return;
    int srcDirIdx = 0;
    for (;
    src.dirIdx <= src.tailDirIdx;
    srcDirIdx++)addAll(src.blockArray[src.dirIdx], 0, BLOCK_SIZE);
    if (src.tailBlkIdx != 0)addAll(src.blockArray[src.tailBlkIdx], 0, src.tailBlkIdx);
}
}