import java.util.*;

public class Translation639 {
    public long valueFor(double elapsed) {
    double val;
    if (modBy == 0) {
        val = elapsed/factor;
    }
    else {
        val = elapsed/factor % modBy;
    }
    if (type.equals("0")) {
        return Long.valueOf(val).longValue();
    }
    else {
        return Long.valueOf(modBy * val).longValue();
    }
}
}