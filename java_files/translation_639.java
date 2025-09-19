import java.util.*;

public class Translation639 {
    public long valueFor(long elapsed) {
    double val;
    try {
        if (modBy != 0) {
            val = (elapsed - minVal) % modBy;
        }
        else {
            val = (elapsed - minVal) / factor;
        }
        return Long.valueOf(val);
    }
}