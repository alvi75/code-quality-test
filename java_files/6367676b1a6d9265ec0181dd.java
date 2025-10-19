import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    /**Return the frequencies that the substring appears in the string. **/
    public static int countOccurrencesOf(String str, String sub) {
        if (sub == null || sub.length() == 0)
            return 0;
        else if (str == null || str.length() == 0)
            return -1;

        int n = str.length();
        int m = sub.length();

        //count the number of times a substring occurs in a string
        int count = 0;
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && str.charAt(i + j) == sub.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
            }
        }

        return count;
    }
}