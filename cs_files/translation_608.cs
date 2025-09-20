using System;
using System.Collections.Generic;

public class Translation608
{
    public static int GetUniqueAlt(IEnumerable<BitSet> altsets){
    BitSet all = GetAlts(altsets);
    if (all.Cardinality() == 1){
        return all.NextSetBit(0);
    }
    return Atn.ATN.INVALID_ALT_NUMBER;
}
}