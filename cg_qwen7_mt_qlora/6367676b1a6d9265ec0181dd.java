import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str, String sub) {
        if (str == null || str.length() == 0 || sub == null || sub.length() == 0)
            return 0;
        int count = 0;
        for (int idx = 0; (idx = str.indexOf(sub, idx)) != -1; ++idx)
            ++count;
        return count;
    }
}