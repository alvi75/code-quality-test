import java.util.*;

public class Generated_6367670b1a6d9265ec017a05 {
    public static String toString(final char ch){
    if (ch == '\n') return "\\n";
    else if (ch == '\r') return "\\r";
    else if (ch == '\t') return "\\t";
    else if (ch == '\\') return "\\\\";
    else if (ch < 0x20) return "\\" + Character.forDigit(ch, 16);
    else return Character.toString(ch);
  }
}