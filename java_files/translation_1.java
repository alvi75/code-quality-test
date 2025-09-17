import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_1 {
    public void addAll(final BlockList<T> src) {
        if (src.size == 0) {
            return;
        }
        int srcDirIdx = 0;
        for (;
        srcDirIdx < src.tailDirIdx;
        srcDirIdx++) {
            addBlock(src.directory[srcDirIdx]);
        }
        if (src.tailBlkIdx != 0) {
            addBlock(src.tailBlock, 0, src.tailBlkIdx);
        }
    }
}