using System;
using System.Collections.Generic;

public class Translation790
{
    public virtual void FreeBefore(int pos){
    Debug.Assert(pos >= 0);
    Debug.Assert(pos <= nextPos);
    int newCount = nextPos - pos;
    Debug.Assert(newCount <= count);
    Debug.Assert(newCount <= buffer.Length);
    buffer[start + pos] = (byte)0;
    nextWrite++;
    pos += changeSkip;
    while (changeSkip > 0 && nextWrite < nextPos){
        --changeSkip;
        nextWrite++;
    }
    if (nextWrite == nextPos){
        Reset();
    }
}
}