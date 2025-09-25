import java.util.*;

public class Translation650 {
    public String getFully(String key) {
    StringBuilder result = new StringBuilder(getTries().size() * 2);
    for (int i = 0;
    i < getTries().size();
    i++) {
        String r = getTries().get(i).getFully(key);
        if (r == null || (r.length() == 1 && r.charAt(0) == EOM)) {
            return result.toString();
        }
        result.append(r);
    }
    return result.toString();
}
}