import java.util.*;

public class Translationtranslation_639 {
    public long valueFor(double elapsed) {
        final double val;
        if (modBy == 0) {
            val = elapsed / factor;
        }
        else {
            val = elapsed / factor % modBy;
        }
        if (type == '0') {
            return (long) Math.round(val);
        }
        else {
            return (long) val;
        }
    }
}