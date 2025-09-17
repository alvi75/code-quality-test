import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_608 {
    public static int getUniqueAlt(Collection<BitSet> altsets) {
        BitSet all = getAlts(altsets);
        if (all.cardinality() == 1) {
            return all.nextSetBit(0);
        }
        return ATN.INVALID_ALT_NUMBER;
    }
}