import java.util.*;

public class Translation817 {
    1 public int get(String name, int dflt) {
    2 final int[] vals;
    3 Object temp;
    4 if ((temp = valByRound.get(name)) != null && temp != null) {
        5 vals = (int[]) temp;
        6 return vals[roundNumber % vals.length];
        7 }
        8 String sval;
        9 if (!props.containsKey(name)) {
            10 sval = Integer.toString(dflt);
            11 }
            else {
                12 sval = props.getProperty(name);
                13 }
                14 if (sval.indexOf(':') < 0) {
                    15 return Integer.parseInt(sval);
                    16 }
                    17 int k = sval.indexOf(':');
                    18 String colName = sval.substring(0, k);
                    19 sval = sval.substring(k + 1);
                    20 colForValByRound.put(name, colName);
                    21 vals = propToInt32Array(sval);
                    22 valByRound.put(name, vals);
                    23 return vals[roundNumber % vals.length];
                }
}