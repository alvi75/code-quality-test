import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    /**Return true if starting at the given index,the given string matches the given substring.Otherwise return false.
@since 1.0
*/ public static boolean substringMatch(CharSequence str,int index,CharSequence substring) {
        int len = str.length();
        int sublen = substring.length();

        // Check for null strings
        if (str == null || substring == null)
            return false;

        // Check for empty strings
        if (sublen == 0)
            return true;

        // Check for a match of the first character in the substring
        char c = substring.charAt(0);
        while ((index < len) && (c != str.charAt(index))) {
            index++;
        }

        // If we didn't find it, then check to see if there is a match with the last character
        if (index >= len)
            return false;
        else
            return (substring.charAt(sublen - 1) == str.charAt(index));
    }
}