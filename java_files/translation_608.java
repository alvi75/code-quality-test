import java.util.*;

public class Translation608 {
    public static int getUniqueAlt(Collection<BitSet> altsets) {
    BitSet all = getAlts(altsets);
    if (all.cardinality() == 1) {
        return all.nextSetBit(0);
    }
    return INVALID_ALT_NUMBER;
}
}