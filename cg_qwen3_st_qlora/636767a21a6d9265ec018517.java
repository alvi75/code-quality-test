import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**
 * Copy bytes from LinkedBuffer and return.
**/
public final byte[] toByteArray(){
    int len = length();
    if (len == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] buf = new byte[len];
    copyTo(buf, 0);
    return buf;
  }
}