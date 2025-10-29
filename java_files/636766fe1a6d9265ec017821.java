import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**Append a byte array to a buffer.**/
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
        if (array==null) return;
        for(int i=0;i<array.length;i++){
            if(i>0) buffer.append(",");
            buffer.append(array[i]);
        }
    }
}