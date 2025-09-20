using System;
using System.Collections.Generic;

public class Translation253
{
    public int ReadUShort(){
    int ch1 = _le.ReadUByte();
    int ch2 = _le.ReadUByte();
    return (ch2 << 8) + (ch1 << 0);
}
}