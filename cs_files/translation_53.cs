using System;
using System.Collections.Generic;

public class Translation53
{
    public override void SetPosition(long pos){
    currentBlockIndex = (int)(pos >> blockBits);
    currentBlock = blocks[currentBlockIndex];
    currentBlockUpto = (int)(pos & blockMask);
}
}