import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**
 * Unescapes Java that found in the String.
 */
public static String unescapeJava(String str) throws Exception {
    if (str == null || str.length() == 0) return str;
    StringBuffer sb = new StringBuffer();
    int lastPos = 0, pos = 0;
    char ch;
    while ((pos = str.indexOf("\\", lastPos)) != -1) {
      sb.append(str.substring(lastPos, pos));
      if (++pos >= str.length()) break;
      ch = str.charAt(pos);
      if (ch == 'u') {
        // Read the ABCD of the unicode escape sequence.
        if (pos + 4 <= str.length()) {
          int value = Integer.parseInt(str.substring(pos + 1, pos + 5), 16);
          sb.append((char)value);
          pos += 4;
        } else {
          sb.append(str.substring(lastPos, str.length()));
          break;
        }
      } else {
        sb.append(ch);
        ++pos;
      }
      lastPos = pos;
    }
    sb.append(str.substring(lastPos));
    return sb.toString();
  }
}