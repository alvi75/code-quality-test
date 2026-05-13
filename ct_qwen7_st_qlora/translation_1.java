import java.util.*;

public class Translation1 {
    public void addAll(BlockList<T> src) {
    if (src.size() == 0)return ;
    final int srcDirIdx = 0;
    for(;
    srcDirIdx < src.tailDirIdx;
    srcDirIdx++)addElements(src.directory[srcDirIdx]);
    if (src.tailBlkIdx != 0)addElements(src.tailBlock, 0, src.tailBlkIdx);
}
}