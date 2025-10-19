import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    /**
 * Copy bytes to a byte array.
 */
public byte[] toByteArray(){
    int len = length();
    byte[] b = new byte[len];
    for(int i=0;i<len;i++){
      b[i] = get(i);
    }
    return b;
  }
}