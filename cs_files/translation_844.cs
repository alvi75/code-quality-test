using System;
using System.Collections.Generic;

public class Translation844
{
    public static int ParseHexInt4(byte[] b, int ptr){
    int v = ParseHexInt2(b, ptr);
    if (v >= 0){
        v = v & 0xFFFF;
    }
    return v;
}
}