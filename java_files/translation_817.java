import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    int vals[] = (int[]) valByRound.get(name);
    if (vals != null) {
        return vals[roundNumber % vals.length];
    }
    String sval = props.getProperty(name);
    if (sval == null) {
        return dflt;
    }
    if (sval.indexOf(":") < 0) {
        return Integer.parseInt(sval);
    }
    vals = propToIntArray(sval);
    valByRound.put(name, vals);
    return vals[roundNumber % vals.length];
}
}