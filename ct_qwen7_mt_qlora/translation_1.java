import java.util.*;

public class Translation1 {
    1 public void addAll(BlockList<T> src) {
    2 if (src.size() == 0)3 return ;
    4 int srcDirIdx = 0 ;
    5 for (;
    srcDirIdx < src.tailDirIdx ;
    srcDirIdx ++)6 addAll(src.directory [ srcDirIdx ] , 0 , BLOCK_SIZE ) ;
    7 if (src.tailBlkIdx != 0)8 addAll(src.tailBlock , 0 , src.tailBlkIdx );
}
}