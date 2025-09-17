import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_1 {
    public void addAll(BlockList<T> src) {
        if (src.size == 0) {
            return;
        }
        int srcDirIdx = 0;
        for (;
        srcDirIdx < src.tailDirIdx;
        srcDirIdx++) {
            add(src.directory[srcDirIdx], 0, BlockList.DEFAULT_BLOCK_SIZE);
        }
        );
        srcDirIdx++;
    }
    if (src.tailBlkIdx != 0) {
        add(src.tailBlock, 0, src.tailBlkIdx);
    }
    }
}