import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    /**
 * Parses out a token until any of the given terminators is encountered and then return the token.
 */
private String parseToken(final char[] terminators) {
    final StringBuilder sb = new StringBuilder();
    while (true) {
      if (this.index >= this.length) {
        break;
      }
      final char c = this.buffer[this.index];
      if (terminators[0] == c || terminators[1] == c) {
        break;
      }
      sb.append(c);
      this.index++;
    }
    return sb.toString();
  }
}