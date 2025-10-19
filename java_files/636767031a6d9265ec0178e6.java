import java.util.*;

public class Generated_636767031a6d9265ec0178e6 {
    /**Convert an array of object Bytes to primitives, return null for a null input array.*/
    if(array == null) {
      return null;
    }
    final int len = array.length;
    if(len == 0) {
      return new byte[0];
    }

    final byte[] result = new byte[len];
    for(int i=0; i<len; i++) {
      result[i] = array[i];
    }
    return result;
  }
}