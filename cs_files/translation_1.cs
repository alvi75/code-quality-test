using System;
using System.Collections.Generic;

public class Translation1
{
    public virtual void AddAll(IBlockList<T> src){
    if (src.Count == 0){
        return;
    }
    int srcDirIdx = 0;
    for (;
    srcDirIdx < src.TailDirIdx;
    srcDirIdx++){
        AddAll(src.Directory[srcDirIdx], 0, BLOCK_SIZE);
    }
    if (src.TailBlkIdx != 0){
        AddAll(src.TailBlock, 0, src.TailBlkIdx);
    }
}
}