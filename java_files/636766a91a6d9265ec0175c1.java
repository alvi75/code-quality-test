import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    /**
 * Convert the original data array to a longer array.
 **/
private void enlarge(final int size) {
    final int newCapacity = (int)(capacity * 1.5);
    if(newCapacity < size){
      capacity = size;
    }else{
      capacity = newCapacity;
    }
    final double[] newData = new double[capacity];
    System.arraycopy(data, 0, newData, 0, length);
    data = newData;
  }
}