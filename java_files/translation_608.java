import java.util.*;

public class Translation608 {
    ublic static int getUniqueAlt(Collection<BitSet> altSets) {
    BitSet all = getAlts(altSets);
    if (all.cardinality() == 1) {
        return all.nextSetBit(0);
    }
    return INVALID_ALT_NUMBER;
}
}