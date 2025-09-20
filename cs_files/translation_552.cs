using System;
using System.Collections.Generic;

public class Translation552
{
    public override int lastIndexOf(string subString, int start){
    lock (this){
        return base.lastIndexOf(subString, start);
    }
}
}