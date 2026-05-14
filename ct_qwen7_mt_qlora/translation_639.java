import java.util.*;

public class Translation639 {
    1 public long valueFor(final double elapsed) {
    2 final double val;
    3 if (modBy == 0)4 val = elapsed / factor;
    5 else6 val = elapsed / factor % modBy;
    7 if (type == '0')8 return (long) Math.round(val);
    9 else10 return (long) val;
}
}