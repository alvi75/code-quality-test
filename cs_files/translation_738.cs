using System;
using System.Collections.Generic;

public class Translation738
{
    public virtual int FindEndOffset(StringBuilder buffer, int start){
    if (start > buffer.Length || start < 0){
        return start;
    }
    bi.SetText(buffer.ToString(0, start - 0));
    return bi.Next() + 1;
}
}