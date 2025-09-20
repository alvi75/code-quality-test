using System;
using System.Collections.Generic;

public class Translation571
{
    public int CompareTo(byte[] bs, int p){
    int cmp;
    cmp = NB.CompareUInt32(w1, NB.DecodeInt32(bs, p));
    if (cmp != 0){
        return cmp;
    }
    cmp = NB.CompareUInt32(w2, NB.DecodeInt32(bs, p + 4));
    if (cmp != 0){
        return cmp;
    }
    cmp = NB.CompareUInt32(w3, NB.DecodeInt32(bs, p + 8));
    if (cmp != 0){
        return cmp;
    }
    cmp = NB.CompareUInt32(w4, NB.DecodeInt32(bs, p + 12));
    if (cmp != 0){
        return cmp;
    }
    return NB.CompareUInt32(w5, NB.DecodeInt32(bs, p + 16));
}
}