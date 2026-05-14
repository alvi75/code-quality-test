import java.util.*;

public class Translation817 {
    ublic int get(String name, int dflt) {
    Integer val = map.get(name);
    if (val == null) {
        val = Integer.valueOf(dflt);
    }
    return val.intValue();
}
}