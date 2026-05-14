import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**Append a byte array to a buffer.**/
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
        if (array == null) {
            appendNull(buffer);
        } else {
            appendString(buffer,fieldName + " = [");
            for(int i=0;i<array.length;i++){
                if(i>0)appendString(buffer,", ");
                appendString(buffer,Integer.toString(array[i]));
            }
            appendString(buffer,"]");
        }
    }
}