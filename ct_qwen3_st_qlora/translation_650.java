import java.util.*;

public class Translation650 {
    ublic String getFully(String key) {
    StringBuilder result = new StringBuilder(tries.size() * 2);
    for (int i = 0;
    i < tries.size();
    i++) {
        String r = tries.get(i).getFully(key);
        if (r == null || (r.length() == 1 && r.charAt(0) == EOM)) {
            return result.toString();
        }
        result.append(r);
    }
    return result.toString();
}
}