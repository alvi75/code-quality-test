import java.util.*;

public class Translation817 {
    ublic int get(String name, int dflt) {
    Object temp = valByRound.get(name);
    if (temp != null) {
        int[] vals = (int[]) temp;
        return vals[roundNumber % vals.length];
    }
    String sval = props.getProperty(name, String.valueOf(dflt));
    if (sval.indexOf(":") < 0) {
        return Integer.parseInt(sval);
    }
    int k = sval.indexOf(":");
    String colName = sval.substring(0, k - 0);
    sval = sval.substring(k + 1);
    colForValByRound.put(name, colName);
    temp = props.getProperty(colName);
    int[] vals = (temp == null) ? EMPTY_INT_ARRAY : propToInt32Array(temp.toString());
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}