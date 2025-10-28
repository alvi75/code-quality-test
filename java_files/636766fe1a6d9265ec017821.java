import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
        if (array != null) {
            int length = array.length;
            for (int i=0; i<length; i++) {
                char c = (char)array[i];
                if (c < 32 || c > 126) {
                    buffer.append("\\x");
                    buffer.append(Integer.toHexString(c));
                } else {
                    buffer.append(c);
                }
            }
        }
    }
}