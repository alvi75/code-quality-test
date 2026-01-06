import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    Integer vals[] = (Integer[]) valByRound.get(name);
    if (vals != null) {
        return vals[roundNumber % vals.length];
    }
    String sval = props.getProperty(name, "" + dflt);
    if (sval.indexOf(":") < 0) {
        return Integer.parseInt(sval);
    }
    int k = sval.indexOf(":");
    String colName = sval.substring(0, k);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    vals = propToIntArray(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}