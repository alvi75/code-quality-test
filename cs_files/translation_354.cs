using System;
using System.Collections.Generic;

public class Translation354
{
    public void WriteLong(long v){
    WriteInt((int)(v >> 0));
    WriteInt((int)(v >> 32));
}
}