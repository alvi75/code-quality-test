import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**
 * Append a byte array to a buffer.
**/
protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
    if(array==null) return;
    int len=array.length;
    for(int i=0;i<len;i++){
      if(i>0) buffer.append(",");
      buffer.append(array[i]);
    }
  }
}