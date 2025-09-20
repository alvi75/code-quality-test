using System;
using System.Collections.Generic;

public class Translation2
{
    public void WriteByte(byte b){
    if (upto == blockSize){
        if (currentBlock != null){
            blocks.Add(currentBlock);
            blockEnd.Add(upto);
            currentBlock = new byte[blockSize];
        }
        upto = 0;
    }
    currentBlock[upto++] = b;
}
}