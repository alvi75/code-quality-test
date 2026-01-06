import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    Integer val = props.get(name);
    if(val == null)return dflt;
    String sval = propToString(val);
    if (sval.indexOf(':') < 0)return Integer.parseInt(sval);
    int k = sval.indexOf(':');
    String colName = sval.substring(0, k);
    sval = sval.substring(k+1);
    colForValByRound.put(name, colName);
    List<Integer> vals = propToInt32List(sval);
    valByRound.put(name, vals);
    return vals.get(roundNumber % vals.size());
}
}