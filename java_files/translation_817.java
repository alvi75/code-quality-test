import java.util.*;

public class Translation817 {
    ublic int get(String name, int dflt) {
    int[] vals;
    Object temp;
    if (valByRound.containsKey(name)) {
        vals = (int[]) valByRound.get(name);
        return vals[roundNumber % vals.length];
    }
    String sval;
    if (!props.containsKey(name)) {
        sval = dflt.toString();
    }
    else {
        sval = props.get(name).toString();
    }
    if (sval.indexOf(':') < 0) {
        return Integer.parseInt(sval, Locale.getDefault());
    }
    int k = sval.indexOf(':');
    String colName = sval.substring(0, k - 0);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    vals = propToInt32Array(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}