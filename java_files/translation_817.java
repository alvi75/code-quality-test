import java.util.*;

public class Translation817 {
    public int get(String name, int defaultValue) {
    int[] vals;
    Object temp;
    if (valByRound.containsKey(name)) {
        vals = (int[]) valByRound.get(name);
        return vals[roundNumber % vals.length];
    }
    String sval;
    if (!props.containsKey(name)) {
        sval = defaultValue.toString();
    }
    else {
        sval = props.get(name).toString();
    }
    if (sval.indexOf(':') < 0) {
        return Integer.parseInt(sval, 10);
    }
    int k = sval.indexOf(':');
    String colName = sval.substring(0, k - 0);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    vals = PropToInt32Array(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}