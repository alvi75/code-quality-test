import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    int[] vals;
    Object temp;
    if (valByRound.get(name) != null) {
        vals = (int[]) valByRound.get(name);
        return vals[roundNumber % vals.length];
    }
    String sval;
    if (!props.getProperty(name, null) == null) {
        sval = props.getProperty(name, "0");
    }
    else {
        sval = dflt.toString(Locale.getDefault());
    }
    if (sval.indexOf(':') < 0) {
        return Integer.parseInt(sval);
    }
    int k = sval.indexOf(':');
    String colName = sval.substring(0, k);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    vals = propToInt32Array(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}