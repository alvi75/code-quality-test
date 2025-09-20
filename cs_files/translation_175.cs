using System;
using System.Collections.Generic;

public class Translation175
{
    public virtual void CopyRawTo(byte[] b, int o){
    NB.EncodeInt32(b, o, w1);
    NB.EncodeInt32(b, o + 4, w2);
    NB.EncodeInt32(b, o + 8, w3);
    NB.EncodeInt32(b, o + 12, w4);
    NB.EncodeInt32(b, o + 16, w5);
}
}