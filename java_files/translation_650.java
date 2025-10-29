import java.util.*;

public class Translation650 {
    public String getFully(String key) {
    StringBuilder result = new StringBuilder(m_tries.size() * 2);
    for (Try t : m_tries) {
        String r = t.getFully(key);
        if (r == null || (r.length() == 1 && r.charAt(0) == EOM)) {
            return result.toString();
        }
        result.append(r);
    }
    return result.toString();
}
}