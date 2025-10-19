import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    /**Return the first index of the searchStr in the given string.**/
public static int indexOf(String str, String searchStr) {
        if (str == null || searchStr == null)
            return -1;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchStr.charAt(index)) {
                index++;
                if (index == searchStr.length())
                    return i - index + 1;
            }
        }
        return -1;
    }
}