import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    Map<String, Integer> vals = valByRound.get(name);
    if (vals == null) {
        vals = new HashMap<>();
        valByRound.put(name, vals);
    }
    Integer v = vals.get(roundNumber % vals.size());
    if (v == null) {
        v = dflt;
    }
    vals.put(roundNumber % vals.size(), v);
    return v;
}
}