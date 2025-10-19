import java.util.*;

public class Generated_636767081a6d9265ec0179a2 {
    /** Check whether a character string is all consist of zero.
    @param s String to check
    @return true if all characters in the string are zeros, false otherwise
  */
  private static boolean isAllZeros(String s) {
    for (int i = 0; i < s.length(); ++i)
      if (s.charAt(i) != '0')
        return false;
    return true;
  }
}