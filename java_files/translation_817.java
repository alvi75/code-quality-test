import java.util.*;

public class Translation817 {
    ublic int get(String name, int dflt) {
    int[] vals;
    Object temp;
    if (valByRound.containsKey(name)) {
        temp = valByRound.get(name);
        if (temp != null) {
            vals = (int[])temp;
            return vals[roundNumber % vals.length];
        }
    }
    String sval;
    if (!props.containsKey(name)) {
        sval = Integer.toString(dflt);
    }
    $assertionError("should not happen");
}
if (sval.indexOf(':') < 0) {
    return Integer.parseInt(sval, CultureInfo.InvariantCulture);
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