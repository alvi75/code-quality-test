import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
    if (index < 0 || index >= str.length()) {
      throw new IllegalArgumentException("Index out of bounds: " + index);
    }
    if (len == 0) return 0;
    final int firstByte = UTF_8.charAt(str.charAt(index));
    // Compute the number of bytes needed to encode the entire string.
    int count = 1;
    for (int i = index + 1; i < str.length(); ++i) {
      final int c = UTF_8.charAt(str.charAt(i));
      if (c != firstByte) break;
      count++;
    }
    return count * len;
  }
}