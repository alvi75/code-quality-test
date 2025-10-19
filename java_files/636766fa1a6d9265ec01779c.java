import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
    final StringBuilder sb = new StringBuilder();
    while (true) {
      final int c = this.reader.read();
      if (c == -1 || terminators.length <= 0) {
        break;
      }
      if (ArrayUtils.contains(terminators, c)) {
        terminators = ArrayUtils.remove(terminators, c);
      } else {
        sb.append((char) c);
      }
    }
    return sb.toString();
  }
}