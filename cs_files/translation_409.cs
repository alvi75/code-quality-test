using System;
using System.Collections.Generic;

public class Translation409
{
    public virtual int codePointAt(int index){
    if (index < 0 || index >= count){
        throw indexAndLength(index);
    }
    return Sharpen.CharHelper.CodePointAt(value, index, count);
}
}