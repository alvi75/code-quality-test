import java.util.*;

public class Translation608 {
    public static int getUniqueAlt(Collection<BitSet> altsets) {
    BitSet alts = new BitSet();
    for (BitSet altsSet : altsets) {
        int minAlt = altsSet.nextSetBit(0);
        alts.set(minAlt);
        if ( alts.cardinality()>1 ) {
            return ATN.INVALID_ALT_NUMBER;
        }
    }
    return alts.nextSetBit(0);
}
}