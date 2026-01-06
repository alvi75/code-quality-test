import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    final String sval = props.getProperty(name, "" + dflt);
    if (sval.indexOf(":") < 0) {
        return Integer.parseInt(sval);
    }
    int k = sval.indexOf(":");
    String colName = sval.substring(0, k - 0);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    vals = propToInt32Array(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}