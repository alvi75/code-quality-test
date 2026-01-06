import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**Append a byte array to a buffer.
@see #appendDetail(StringBuffer, String, Object)
**/protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
        if(array==null) return;
        buffer.append(fieldName).append("=");
        for(int i=0;i<array.length;++i){
            buffer.append(Integer.toHexString((int)(array[i]&0xff)));
        }
    }
}